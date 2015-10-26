.class public final Lboe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lboe;->a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 336
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lboe;->a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;

    move-result-object v1

    invoke-virtual {v1}, Lboh;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 337
    iget-object v1, p0, Lboe;->a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;

    move-result-object v1

    invoke-virtual {v1, v0}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 338
    iget-object v1, p0, Lboe;->a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->c(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->a(I)V

    .line 339
    iget-object v1, p0, Lboe;->a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->d(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lbog;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 340
    iget-object v1, p0, Lboe;->a:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->d(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lbog;

    move-result-object v1

    invoke-interface {v1, v0}, Lbog;->a(I)V

    .line 345
    :cond_0
    return-void

    .line 336
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
