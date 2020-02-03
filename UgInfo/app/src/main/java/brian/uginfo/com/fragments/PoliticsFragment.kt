package brian.uginfo.com.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import brian.uginfo.com.R


/**
 * PoliticsFragment
 *  2 Buttons
 *  Nav graph start fragment
 */

class PoliticsFragment : Fragment(), View.OnClickListener { //OnClickListener

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_poliics, container, false)

        var myWebView: WebView = view.findViewById(R.id.webViewPolitics)
        myWebView.loadUrl("https://medium.com/topic/politics")
        var webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        myWebView.webViewClient = WebViewClient()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController() //Initialising navController

    }

////        Initialising button click event listener
//        home_next_frag_btn.setOnClickListener(this)
//        home_close_app_btn.setOnClickListener(this)
//    }

//    override fun onClick(v: View?) { //When click occurs this function is triggered
//        when(v!!.id) { //Check for the id of the view i which click event happened
//            R.id.home_next_frag_btn -> goToProfile()
//            R.id.home_close_app_btn -> goTosettings()
//        }
//    }

//    private fun goToProfile() {
//        val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment() //if needed pass values to frag here NB: add that arguments to nav_graph also
//        navController.navigate(action) //navigation
//
//        home_next_frag_btn.setOnClickListener {
//            val intent = Intent(activity, FoodFragment::class.java)
//            startActivity(intent)
//        }
//    }
//
//    private fun goTosettings() {
//        home_next_frag_btn.setOnClickListener {
//            val intent = Intent(activity, HealthFragment::class.java)
//            startActivity(intent)
//        }
//    }

//    private fun closeApp() {
//        (activity as MainActivity).exitApp()
//    }

    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
