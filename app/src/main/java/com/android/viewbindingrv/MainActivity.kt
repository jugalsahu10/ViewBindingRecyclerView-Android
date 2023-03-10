package com.android.viewbindingrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.viewbindingrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}