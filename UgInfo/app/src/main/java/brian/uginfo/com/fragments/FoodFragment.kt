package brian.uginfo.com.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import brian.uginfo.com.R


/**
 * FoodFragment
 */

class FoodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_food, container, false)
        var myWebView: WebView = view.findViewById(R.id.webViewFood)
        myWebView.loadUrl("https://medium.com/topic/food")
        var webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        myWebView.webViewClient = WebViewClient()

        return view    }


}
