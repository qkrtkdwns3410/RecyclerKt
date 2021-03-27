package com.example.recyclerkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class profileAdapter(val profileList: ArrayList<profiles>) : RecyclerView.Adapter<profileAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): profileAdapter.CustomViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val profile :profiles = profileList.get(curPos)
                Toast.makeText(parent.context,"이름 : ${profile.name} \n 나이 : ${profile.age} \n 직업 : ${profile.job}",Toast.LENGTH_SHORT).show()

            }
        }
    }

    override fun onBindViewHolder(holder: profileAdapter.CustomViewHolder, position: Int)
    {
        holder.gender.setImageResource(profileList.get(position).gender)
        holder.age.text = profileList.get(position).age.toString()
        holder.name.text = profileList.get(position).name
        holder.job.text = profileList.get(position).job

    }

    override fun getItemCount(): Int
    {
        return profileList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { //콜론은 상속입니다.
        val gender = itemView.findViewById<ImageView>(R.id.iv_Man) //성별
        val name = itemView.findViewById<TextView>(R.id.tv_name) //이름
        val age = itemView.findViewById<TextView>(R.id.tv_age) //나이
        val job = itemView.findViewById<TextView>(R.id.tv_job) //직업

    }


}