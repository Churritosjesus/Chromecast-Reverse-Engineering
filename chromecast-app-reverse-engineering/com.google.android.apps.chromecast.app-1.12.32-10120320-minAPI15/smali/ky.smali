.class final Lky;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lkx;


# direct methods
.method constructor <init>(Lkx;)V
    .locals 0

    .prologue
    .line 1628
    iput-object p1, p0, Lky;->a:Lkx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x3

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 1630
    iget-object v6, p0, Lky;->a:Lkx;

    .line 2719
    iget-object v0, v6, Lkx;->b:Lmf;

    .line 3448
    iget v2, v0, Lmf;->k:I

    .line 2720
    iget v0, v6, Lkx;->a:I

    if-ne v0, v4, :cond_2

    move v3, v8

    .line 2721
    :goto_0
    if-eqz v3, :cond_4

    .line 2722
    iget-object v0, v6, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v4}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v1

    .line 2723
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    :goto_1
    add-int/2addr v0, v2

    move-object v2, v1

    move v1, v0

    .line 2729
    :goto_2
    if-eqz v2, :cond_6

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v0

    if-lt v0, v1, :cond_1

    :cond_0
    if-nez v3, :cond_6

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v0

    if-le v0, v1, :cond_6

    :cond_1
    iget-object v0, v6, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_6

    .line 2732
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lku;

    .line 2733
    iget-object v3, v6, Lkx;->b:Lmf;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v9

    invoke-virtual {v3, v2, v1, v9}, Lmf;->a(Landroid/view/View;II)Z

    .line 2734
    iput-boolean v8, v0, Lku;->c:Z

    .line 2735
    iget-object v0, v6, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 2737
    invoke-virtual {v6}, Lkx;->b()V

    .line 2739
    iget-object v9, v6, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    .line 3485
    iget-boolean v0, v9, Landroid/support/v4/widget/DrawerLayout;->e:Z

    if-nez v0, :cond_6

    .line 3486
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    move-wide v2, v0

    move v6, v5

    .line 3487
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 3489
    invoke-virtual {v9}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I

    move-result v1

    .line 3490
    :goto_3
    if-ge v7, v1, :cond_5

    .line 3491
    invoke-virtual {v9, v7}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 3490
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_2
    move v3, v7

    .line 2720
    goto :goto_0

    :cond_3
    move v0, v7

    .line 2723
    goto :goto_1

    .line 2725
    :cond_4
    iget-object v0, v6, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v1

    .line 2726
    iget-object v0, v6, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v0

    sub-int/2addr v0, v2

    move-object v2, v1

    move v1, v0

    goto :goto_2

    .line 3493
    :cond_5
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 3494
    iput-boolean v8, v9, Landroid/support/v4/widget/DrawerLayout;->e:Z

    .line 1631
    :cond_6
    return-void
.end method
