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

public final class ContentCraftsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText mEdtId;

  @NonNull
  public final EditText mEdtMyName;

  @NonNull
  public final EditText mEdtMyPassword;

  @NonNull
  public final EditText mEdtMyPhoneNumber;

  @NonNull
  public final TextView mTvRegister;

  @NonNull
  public final TextView mTvinfo;

  private ContentCraftsBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnRegister,
      @NonNull EditText mEdtId, @NonNull EditText mEdtMyName, @NonNull EditText mEdtMyPassword,
      @NonNull EditText mEdtMyPhoneNumber, @NonNull TextView mTvRegister,
      @NonNull TextView mTvinfo) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.mEdtId = mEdtId;
    this.mEdtMyName = mEdtMyName;
    this.mEdtMyPassword = mEdtMyPassword;
    this.mEdtMyPhoneNumber = mEdtMyPhoneNumber;
    this.mTvRegister = mTvRegister;
    this.mTvinfo = mTvinfo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentCraftsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentCraftsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_crafts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentCraftsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.mEdtId;
      EditText mEdtId = ViewBindings.findChildViewById(rootView, id);
      if (mEdtId == null) {
        break missingId;
      }

      id = R.id.mEdtMyName;
      EditText mEdtMyName = ViewBindings.findChildViewById(rootView, id);
      if (mEdtMyName == null) {
        break missingId;
      }

      id = R.id.mEdtMyPassword;
      EditText mEdtMyPassword = ViewBindings.findChildViewById(rootView, id);
      if (mEdtMyPassword == null) {
        break missingId;
      }

      id = R.id.mEdtMyPhoneNumber;
      EditText mEdtMyPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (mEdtMyPhoneNumber == null) {
        break missingId;
      }

      id = R.id.mTvRegister;
      TextView mTvRegister = ViewBindings.findChildViewById(rootView, id);
      if (mTvRegister == null) {
        break missingId;
      }

      id = R.id.mTvinfo;
      TextView mTvinfo = ViewBindings.findChildViewById(rootView, id);
      if (mTvinfo == null) {
        break missingId;
      }

      return new ContentCraftsBinding((ConstraintLayout) rootView, btnRegister, mEdtId, mEdtMyName,
          mEdtMyPassword, mEdtMyPhoneNumber, mTvRegister, mTvinfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}