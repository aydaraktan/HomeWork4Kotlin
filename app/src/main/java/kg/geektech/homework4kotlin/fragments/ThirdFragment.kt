package kg.geektech.homework4kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.geektech.homework4kotlin.databinding.FragmentThirdBinding
import kg.geektech.homework4kotlin.viewModels.SharedViewModel

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    private lateinit var  sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater,container,false)

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel.plus.observe(viewLifecycleOwner,){
            binding.tvList.text = it.toString()
        }
    }


}