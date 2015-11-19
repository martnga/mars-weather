package org.mansa.marsweather;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by mansa on 11/19/15.
 */
public class CustomJsonRequest extends JsonObjectRequest {

    public CustomJsonRequest(int method, String url, JSONObject jsonRequest,
                             Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(method, url, jsonRequest, listener, errorListener);
    }

    private Priority mPriority;

    public void setPriority(Priority priority) {
        mPriority = priority;
    }

    @Override
    public Priority getPriority() {
        return mPriority == null ? Priority.NORMAL : mPriority;
    }
}

