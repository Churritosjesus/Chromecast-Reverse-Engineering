.class public Lcom/google/android/apps/chromecast/app/widget/ChromecastSwipeRefreshLayout;
.super Llw;
.source "PG"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Llw;-><init>(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Llw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 27
    const v0, 0x102000a

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/widget/ChromecastSwipeRefreshLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    invoke-super {p0}, Llw;->b()Z

    move-result v0

    .line 42
    :goto_0
    return v0

    .line 32
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xe

    if-ge v3, v4, :cond_5

    .line 33
    instance-of v3, v0, Landroid/widget/AbsListView;

    if-eqz v3, :cond_3

    .line 34
    check-cast v0, Landroid/widget/AbsListView;

    .line 35
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v3

    if-lez v3, :cond_2

    .line 36
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v3

    if-gtz v3, :cond_1

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingTop()I

    move-result v0

    if-ge v3, v0, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0

    .line 39
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-lez v0, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0

    .line 42
    :cond_5
    const/4 v1, -0x1

    invoke-static {v0, v1}, Lgt;->b(Landroid/view/View;I)Z

    move-result v0

    goto :goto_0
.end method
