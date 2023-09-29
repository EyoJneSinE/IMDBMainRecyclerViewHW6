package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.annotation.SuppressLint
import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.CarouselViewPagerBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.ViewPagerChildAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ViewPagerViewHolder(
    private val binding: CarouselViewPagerBinding
) : RecyclerView.ViewHolder(binding.root) {

    private var isUserTouching = false

    fun bindViewPagerRV(item: DataModel.ViewPagerList) {
        init(item)

        val coroutineScope = CoroutineScope(Dispatchers.Main)

        val autoScrollJob = coroutineScope.launch {
            while (true) {
                delay(8000L)
                if (!isUserTouching) {
                    if (binding.carouselViewPager.currentItem < item.viewPager.size - 1) {
                        binding.carouselViewPager.currentItem++
                        delay(8000L)
                    } else {
                        binding.carouselViewPager.currentItem = 0
                        delay(8000L)
                    }
                }
            }
        }

        autoScrollJob.start()

        binding.carouselViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)

                val translationX = positionOffsetPixels.toFloat()
                binding.textContainer.translationX = translationX
                binding.movieTitleTextView.translationX = translationX
                binding.movieContentsTextView.translationX = translationX

                binding.carouselViewPager.translationX = positionOffset
                binding.carouselTextView.translationX = positionOffset
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val currentItem = item.viewPager[position]
                binding.carouselTextView.setImageResource(
                    binding.root.context.resources.getIdentifier(
                        currentItem.viewPagerVerticalPoster,
                        "drawable", binding.root.context.packageName)
                )

                binding.movieTitleTextView.text = currentItem.viewPagerHeadline
                binding.movieContentsTextView.text = currentItem.viewPagerContents
                binding.carouselViewPager.setOnTouchListener { _, event ->
                    when (event.action) {
                        MotionEvent.ACTION_DOWN -> {
                            isUserTouching = true
                            autoScrollJob.cancel()
                        }
                        MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                            isUserTouching = false
                            autoScrollJob.start()
                        }
                        MotionEvent.ACTION_MOVE -> {
                            autoScrollJob.cancel()
                        }
                    }
                    false
                }
            }
        })
    }
    private fun init(item: DataModel.ViewPagerList){

        binding.carouselViewPager.adapter =
            ViewPagerChildAdapter(binding.root.context).apply {
                submitList(item.viewPager)
            }
        binding.carouselViewPager.offscreenPageLimit = 3
        /*binding.carouselViewPager.clipToPadding = false
        binding.carouselViewPager.clipChildren = false
        binding.carouselViewPager.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER*/
    }
}

/*binding.carouselTextView.setImageResource(
                    binding.root.context.resources.getIdentifier(
                        currentItem.viewPagerVerticalPoster,
                        "drawable", binding.root.context.packageName)
                )

                binding.movieTitleTextView.text = currentItem.viewPagerHeadline
                binding.movieContentsTextView.text = currentItem.viewPagerContents*/