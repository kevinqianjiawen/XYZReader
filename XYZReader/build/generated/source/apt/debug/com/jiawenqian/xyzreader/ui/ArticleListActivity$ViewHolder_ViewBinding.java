// Generated code from Butter Knife. Do not modify!
package com.jiawenqian.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiawenqian.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleListActivity$ViewHolder_ViewBinding<T extends ArticleListActivity.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public ArticleListActivity$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.thumbnailView = Utils.findRequiredViewAsType(source, R.id.thumbnail, "field 'thumbnailView'", DynamicHeightNetworkImageView.class);
    target.titleView = Utils.findRequiredViewAsType(source, R.id.article_title, "field 'titleView'", TextView.class);
    target.subtitleView = Utils.findRequiredViewAsType(source, R.id.article_subtitle, "field 'subtitleView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.thumbnailView = null;
    target.titleView = null;
    target.subtitleView = null;

    this.target = null;
  }
}
