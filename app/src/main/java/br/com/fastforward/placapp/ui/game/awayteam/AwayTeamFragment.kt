package br.com.fastforward.placapp.ui.game.awayteam


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import br.com.fastforward.placapp.R
import kotlinx.android.synthetic.main.fragment_away_team.*

class AwayTeamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_away_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*away_fragment_btn_next.setOnClickListener {
            activity?.let {
                it.startActivity(Intent(it, ScoreActivity::class.java))
                it.finish()
            }*/
        away_fragment_btn_next.setOnClickListener {
            val intent = Intent("FILTER_AWAY_TEAM_NAME")
            intent.putExtra("away_team_name", away_team_hint.text.toString())
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)


        }
    }
}
