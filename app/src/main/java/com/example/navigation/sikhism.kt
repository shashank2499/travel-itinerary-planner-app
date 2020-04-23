package com.example.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class sikhism : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=inflater.inflate(R.layout.fragment_christianity, container, false)
        sikhismapiapi().getplaces().enqueue(object: Callback<List<place>> {
            override fun onFailure(call: Call<List<place>>, t: Throwable) {
                Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()

            }

            override fun onResponse(call: Call<List<place>>, response: Response<List<place>>) {
                val places=response.body()
                places?.let {
                    places(it)

                }
            }
        })

        return v

    }

    private fun places(places:List<place>)
    {
        recyclerViewPlaces.layoutManager= LinearLayoutManager(context)
        recyclerViewPlaces.adapter=sikhismAdapter(places)
    }
}


