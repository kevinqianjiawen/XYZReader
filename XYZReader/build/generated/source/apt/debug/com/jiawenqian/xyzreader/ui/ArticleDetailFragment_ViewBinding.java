// Generated code from Butter Knife. Do not modify!
package com.jiawenqian.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiawenqian.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleDetailFragment_ViewBinding<T extends ArticleDetailFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ArticleDetailFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mPhotoView = Utils.findRequiredViewAsType(source, R.id.photo, "field 'mPhotoView'", DynamicHeightNetworkImageView.class);
    target.mShareFav = Utils.findRequiredViewAsType(source, R.id.share_fab, "field 'mShareFav'", ImageButton.class);
    target.titleView = Utils.findRequiredViewAsType(source, R.id.article_title, "field 'titleView'", TextView.class);
    target.bylineView = Utils.findRequiredViewAsType(source, R.id.article_byline, "field 'bylineView'", TextView.class);
    target.bodyView = Utils.findRequiredViewAsType(source, R.id.article_body, "field 'bodyView'", TextView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mPhotoView = null;
    target.mShareFav = null;
    target.titleView = null;
    target.bylineView = null;
    target.bodyView = null;
    target.toolbar = null;

    this.target = null;
  }
}
