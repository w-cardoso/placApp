package br.com.fastforward.placapp.ui.game.event


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import br.com.fastforward.placapp.R
import kotlinx.android.synthetic.main.fragment_event.*


class EventFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        event_fragment_btn_next.setOnClickListener {
            /*val ft = activity?.supportFragmentManager?.beginTransaction()
            ft?.replace(R.id.containerGame, HomeTeamFragment())
            ft?.addToBackStack(null)
            ft?.commit()*/
            val intent = Intent("FILTER_EVENT_NAME")
            intent.putExtra("event_name", away_team_hint.text.toString())
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
        }
    }


}
