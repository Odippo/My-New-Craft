// Generated by view binder compiler. Do not edit!
package com.example.myproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySigninBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button mBtnSignin;

  @NonNull
  public final EditText mEdtPasswordw;

  @NonNull
  public final EditText mEdtUsername;

  @NonNull
  public final TextView mTvSignIn;

  private ActivitySigninBinding(@NonNull ConstraintLayout rootView, @NonNull Button mBtnSignin,
      @NonNull EditText mEdtPasswordw, @NonNull EditText mEdtUsername,
      @NonNull TextView mTvSignIn) {
    this.rootView = rootView;
    this.mBtnSignin = mBtnSignin;
    this.mEdtPasswordw = mEdtPasswordw;
    this.mEdtUsername = mEdtUsername;
    this.mTvSignIn = mTvSignIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySigninBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySigninBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBtnSignin;
      Button mBtnSignin = ViewBindings.findChildViewById(rootView, id);
      if (mBtnSignin == null) {
        break missingId;
      }

      id = R.id.mEdtPasswordw;
      EditText mEdtPasswordw = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPasswordw == null) {
        break missingId;
      }

      id = R.id.mEdtUsername;
      EditText mEdtUsername = ViewBindings.findChildViewById(rootView, id);
      if (mEdtUsername == null) {
        break missingId;
      }

      id = R.id.mTvSignIn;
      TextView mTvSignIn = ViewBindings.findChildViewById(rootView, id);
      if (mTvSignIn == null) {
        break missingId;
      }

      return new ActivitySigninBinding((ConstraintLayout) rootView, mBtnSignin, mEdtPasswordw,
          mEdtUsername, mTvSignIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
