package br.com.fastforward.placapp.ui.game.hometeam


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import br.com.fastforward.placapp.R
import kotlinx.android.synthetic.main.fragment_home_team.*

class HomeTeamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*home_fragment_btn_next.setOnClickListener {
            val ft = activity?.supportFragmentManager?.beginTransaction()
            ft?.replace(R.id.containerGame, AwayTeamFragment())
            ft?.addToBackStack(null)
            ft?.commit()*/
        home_fragment_btn_next.setOnClickListener {
            val intent = Intent("FILTER_HOME_TEAM_NAME")
            intent.putExtra("home_team_name", away_team_hint.text.toString())
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
        }

    }


}

