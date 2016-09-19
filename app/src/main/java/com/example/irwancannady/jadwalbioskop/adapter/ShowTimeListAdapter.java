package com.example.irwancannady.jadwalbioskop.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.irwancannady.jadwalbioskop.R;
import com.example.irwancannady.jadwalbioskop.model.ShowTime;
import com.example.irwancannady.jadwalbioskop.util.FlowLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irwancannady on 9/19/16.
 */
public class ShowTimeListAdapter extends RecyclerView.Adapter<ShowTimeListAdapter.ShowtimeViewHolder>{

    private List<ShowTime> showtimeList;
    private Context context;

    public ShowTimeListAdapter(Context context) {
            this.context = context;
            showtimeList = new ArrayList<>();
    }

    private void add(ShowTime item) {
            showtimeList.add(item);
            notifyItemInserted(showtimeList.size() - 1);
    }

    public void addAll(List<ShowTime> showtimeList) {
            for (ShowTime showtime : showtimeList) {
            add(showtime);
         }
    }

    public void remove(ShowTime item) {
            int position = showtimeList.indexOf(item);
            if (position > -1) {
            showtimeList.remove(position);
            notifyItemRemoved(position);
         }
    }

    public void clear() {
            while (getItemCount() > 0) {
            remove(getItem(0));
         }
    }

    public ShowTime getItem(int positon){
            return showtimeList.get(positon);
    }

    @Override
    public ShowtimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_showtime, parent, false);
            return new ShowtimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ShowtimeViewHolder holder, int position) {
    final ShowTime showtime = showtimeList.get(position);
            holder.theater.setText(showtime.getBioskop());
            for (int i=0; i<showtime.getJam().size(); i++) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_item_time, holder.lyTime, false);
            TextView time = (TextView) view.findViewById(R.id.time);
            time.setText(showtime.getJam().get(i));
            holder.lyTime.addView(view);
         }
            holder.price.setText(showtime.getHarga());
    }

    @Override
    public int getItemCount() {
            return showtimeList.size();
            }

    static class ShowtimeViewHolder extends RecyclerView.ViewHolder {

        TextView theater;
        FlowLayout lyTime;
        TextView price;

        public ShowtimeViewHolder(View itemView) {
            super(itemView);

            theater = (TextView) itemView.findViewById(R.id.theater);
            lyTime = (FlowLayout) itemView.findViewById(R.id.lyTime);
            price = (TextView) itemView.findViewById(R.id.price);
        }
    }
}
