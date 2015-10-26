.class public Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;
.super Landroid/widget/FrameLayout;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcrd;
.implements Lcrf;


# instance fields
.field public a:Lcqf;

.field public b:Lcqh;

.field public c:Lcqg;

.field public d:Lcsq;

.field public e:Ljava/util/List;

.field public f:Landroid/widget/ListView;

.field public g:Landroid/widget/FrameLayout;

.field public h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

.field public i:Lcqs;

.field public j:Lcom/google/android/gms/common/api/GoogleApiClient;

.field public k:Lcqj;

.field public l:I

.field public m:Landroid/view/View;

.field public n:Z

.field public o:Z

.field public p:Lcqw;

.field public q:Landroid/view/View;

.field private r:Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

.field private s:Landroid/view/ViewGroup;

.field private t:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

.field private u:I

.field private v:I

.field private w:Z

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 85
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 86
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 89
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 74
    iput-boolean v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->n:Z

    .line 75
    iput-boolean v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->o:Z

    .line 81
    iput-boolean v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->x:Z

    .line 90
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 91
    new-array v0, v1, [I

    sget v3, La;->hJ:I

    aput v3, v0, v2

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 1766
    const/16 v3, 0x15

    invoke-static {v3}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b(I)Z

    move-result v3

    .line 93
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->w:Z

    .line 94
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 2229
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v3, La;->iq:I

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2230
    sget v0, La;->im:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    .line 2231
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2232
    sget v0, La;->hT:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->t:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    .line 2233
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->t:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/people/accountswitcherview/ExpanderView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2234
    sget v0, La;->il:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 2236
    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    iget-boolean v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->w:Z

    .line 2750
    if-eqz v0, :cond_0

    const/16 v0, 0xb

    .line 2751
    invoke-static {v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->j:Z

    .line 2752
    iget-boolean v0, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->j:Z

    iput-boolean v0, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->i:Z

    .line 2237
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 3170
    iput-object p0, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a:Lcrf;

    .line 2238
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 3174
    iput-object p0, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->g:Lcrd;

    .line 2239
    sget v0, La;->hW:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->f:Landroid/widget/ListView;

    .line 2240
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->f:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 2241
    sget v0, La;->hX:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->r:Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

    .line 2242
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->l:I

    .line 2243
    sget v0, La;->ie:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    .line 2244
    invoke-virtual {p0, v2}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(I)V

    .line 96
    return-void

    :cond_0
    move v0, v2

    .line 2751
    goto :goto_0
.end method

.method private a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 394
    invoke-virtual {p1, p2}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 395
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->u:I

    .line 397
    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;I)V
    .locals 4

    .prologue
    .line 39
    .line 8836
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    .line 8837
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    .line 8836
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 8840
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->p:Lcqw;

    .line 9037
    iput p1, v0, Lcqw;->a:I

    .line 8843
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 9243
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    if-nez v0, :cond_0

    .line 9244
    invoke-virtual {v1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a()V

    .line 9247
    :cond_0
    iget v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->k:I

    add-int v2, v0, p1

    .line 9248
    invoke-virtual {v1, v2}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->setMinimumHeight(I)V

    .line 9251
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->x:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 9252
    if-nez v0, :cond_1

    .line 9253
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v0, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 9257
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v2, v2, Lcrg;->x:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9258
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->e:Landroid/view/View;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Landroid/view/View;I)V

    .line 9259
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->q:Landroid/view/View;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Landroid/view/View;I)V

    .line 9260
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->h:Landroid/view/View;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Landroid/view/View;I)V

    .line 9261
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->i:Landroid/view/View;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Landroid/view/View;I)V

    .line 9262
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->s:Landroid/view/View;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Landroid/view/View;I)V

    .line 9263
    iget-object v0, v1, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->h:Lcrg;

    iget-object v0, v0, Lcrg;->t:Landroid/view/View;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Landroid/view/View;I)V

    .line 39
    return-void

    .line 9255
    :cond_1
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0
.end method

.method private a(Z)V
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/high16 v2, 0x3f800000    # 1.0f

    const v5, 0x3f4ccccd    # 0.8f

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 597
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 5814
    iget v0, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->b:I

    .line 598
    packed-switch v0, :pswitch_data_0

    .line 625
    :goto_0
    return-void

    .line 600
    :pswitch_0
    if-eqz p1, :cond_0

    .line 601
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 602
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 603
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 604
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v5}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    invoke-direct {p0, v4, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(ZLandroid/view/animation/Interpolator;)V

    .line 608
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 609
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->r:Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

    invoke-virtual {v0, v6}, Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;->setVisibility(I)V

    goto :goto_0

    .line 606
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    .line 613
    :pswitch_1
    if-eqz p1, :cond_1

    .line 614
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 615
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 616
    const-wide/16 v2, 0x85

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 617
    const/4 v0, 0x1

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1, v5}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(ZLandroid/view/animation/Interpolator;)V

    .line 621
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v6}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 622
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->r:Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;->setVisibility(I)V

    goto :goto_0

    .line 619
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_2

    .line 598
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(ZLandroid/view/animation/Interpolator;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 629
    if-eqz p1, :cond_0

    move v0, v1

    move v3, v2

    .line 637
    :goto_0
    const/16 v4, 0xb

    invoke-static {v4}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 638
    iget-object v4, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->r:Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

    const-string v5, "animatedHeightFraction"

    const/4 v6, 0x2

    new-array v6, v6, [F

    int-to-float v3, v3

    aput v3, v6, v2

    int-to-float v0, v0

    aput v0, v6, v1

    invoke-static {v4, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 640
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 641
    invoke-virtual {v0, p2}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 642
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 646
    :goto_1
    return-void

    :cond_0
    move v0, v2

    move v3, v1

    .line 634
    goto :goto_0

    .line 644
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->r:Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;

    int-to-float v0, v0

    .line 6030
    iput v0, v1, Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;->a:F

    .line 6031
    invoke-virtual {v1}, Lcom/google/android/gms/people/accountswitcherview/ShrinkingItem;->requestLayout()V

    goto :goto_1
.end method

.method public static b(I)Z
    .locals 1

    .prologue
    .line 759
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(I)V
    .locals 1

    .prologue
    .line 400
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->offsetTopAndBottom(I)V

    .line 401
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTop()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->v:I

    .line 402
    return-void
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 766
    const/16 v0, 0x15

    invoke-static {v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b(I)Z

    move-result v0

    return v0
.end method

.method private d(I)V
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(I)V

    .line 585
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 589
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Z)V

    .line 594
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 572
    invoke-direct {p0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d(I)V

    .line 573
    invoke-direct {p0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Z)V

    .line 574
    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->t:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 4814
    iget v3, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->b:I

    .line 575
    if-ne v3, v0, :cond_0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/google/android/gms/people/accountswitcherview/ExpanderView;->a(Z)V

    .line 577
    return-void

    :cond_0
    move v0, v1

    .line 575
    goto :goto_0
.end method

.method public final a(Lcsq;)V
    .locals 2

    .prologue
    .line 682
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Lcsq;Z)V

    .line 683
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a:Lcqf;

    if-eqz v0, :cond_0

    .line 684
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a:Lcqf;

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    invoke-interface {v0, v1}, Lcqf;->a(Lcsq;)V

    .line 686
    :cond_0
    return-void
.end method

.method public a(Lcsq;Z)V
    .locals 3

    .prologue
    .line 478
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    .line 479
    iput-object p1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    .line 480
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 481
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    invoke-static {v1, v0, v2}, Lcqs;->a(Ljava/util/List;Lcsq;Lcsq;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    .line 482
    if-nez p2, :cond_0

    .line 483
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Lcsq;)V

    .line 485
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcqs;->a(Ljava/util/List;)V

    .line 490
    :goto_0
    return-void

    .line 488
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->a(Lcsq;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 692
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    if-eqz v0, :cond_0

    .line 693
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    .line 6328
    iget-object v1, v0, Lcqs;->e:Lcqe;

    if-eqz v1, :cond_0

    .line 6329
    iget-object v0, v0, Lcqs;->e:Lcqe;

    invoke-virtual {v0}, Lcqe;->a()V

    .line 695
    :cond_0
    return-void
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x2

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 699
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->s:Landroid/view/ViewGroup;

    if-eq p1, v0, :cond_1

    .line 703
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->t:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    if-ne p1, v0, :cond_1

    .line 704
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 6814
    iget v0, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->b:I

    .line 705
    if-ne v0, v2, :cond_2

    move v0, v1

    .line 704
    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d(I)V

    .line 708
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->t:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 7814
    iget v3, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->b:I

    .line 709
    if-ne v3, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/people/accountswitcherview/ExpanderView;->a(Z)V

    .line 8589
    invoke-direct {p0, v2}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Z)V

    .line 713
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 707
    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 282
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 285
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 287
    iput-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    .line 289
    :cond_0
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 650
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    invoke-virtual {v0, p3}, Lcqs;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_1

    .line 651
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    invoke-virtual {v0, p3}, Lcqs;->a(I)Lcsq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Lcsq;Z)V

    .line 653
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a:Lcqf;

    if-eqz v0, :cond_0

    .line 654
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a:Lcqf;

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    invoke-interface {v0, v1}, Lcqf;->a(Lcsq;)V

    .line 665
    :cond_0
    :goto_0
    return-void

    .line 656
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    invoke-virtual {v0, p3}, Lcqs;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 657
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c:Lcqg;

    if-eqz v0, :cond_0

    .line 658
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c:Lcqg;

    invoke-interface {v0}, Lcqg;->a()V

    goto :goto_0

    .line 660
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    invoke-virtual {v0, p3}, Lcqs;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 661
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b:Lcqh;

    if-eqz v0, :cond_0

    .line 662
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b:Lcqh;

    invoke-interface {v0}, Lcqh;->a()V

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 313
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 318
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 319
    iget v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->u:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 320
    iget v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->u:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 322
    :cond_0
    iget v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->v:I

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getTop()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 323
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    iget v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->v:I

    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->offsetTopAndBottom(I)V

    .line 325
    :cond_1
    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    .prologue
    .line 293
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 294
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 295
    invoke-virtual {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 296
    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 298
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    invoke-virtual {v0}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->getMeasuredHeight()I

    move-result v0

    .line 299
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getPaddingLeft()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    .line 300
    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getPaddingBottom()I

    move-result v4

    .line 299
    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 304
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    .line 305
    invoke-virtual {p0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->getHeight()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 304
    invoke-virtual {v0, p1, v1}, Landroid/widget/FrameLayout;->measure(II)V

    .line 309
    :cond_0
    return-void

    .line 294
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 332
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 333
    if-nez p4, :cond_0

    cmpg-float v1, p3, v2

    if-gez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v1

    if-gez v1, :cond_0

    .line 335
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v1

    neg-int v1, v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Landroid/view/View;I)V

    .line 336
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    neg-int v0, v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c(I)V

    .line 337
    const/4 v0, 0x1

    .line 347
    :goto_0
    return v0

    .line 338
    :cond_0
    if-eqz p4, :cond_2

    cmpl-float v1, p3, v2

    if-lez v1, :cond_2

    .line 339
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    neg-int v2, v2

    if-le v1, v2, :cond_1

    .line 341
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Landroid/view/View;I)V

    .line 343
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getTop()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    neg-int v2, v2

    if-le v1, v2, :cond_2

    .line 344
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    neg-int v0, v0

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c(I)V

    .line 347
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 360
    iget-object v2, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 361
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 3814
    iget v0, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->b:I

    .line 361
    if-ne v0, v5, :cond_1

    .line 391
    :cond_0
    :goto_0
    return-void

    .line 366
    :cond_1
    if-lez p3, :cond_5

    .line 368
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v0

    if-lez v0, :cond_5

    .line 370
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v0

    if-le v0, p3, :cond_2

    .line 371
    neg-int v0, p3

    .line 377
    :goto_1
    if-eqz v0, :cond_0

    .line 378
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    neg-int v4, v4

    if-ge v3, v4, :cond_3

    .line 379
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Landroid/view/View;I)V

    .line 383
    :goto_2
    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getTop()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    neg-int v4, v4

    if-ge v3, v4, :cond_4

    .line 384
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    neg-int v2, v2

    iget-object v3, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-direct {p0, v2}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c(I)V

    .line 388
    :goto_3
    aput v1, p4, v1

    .line 389
    aput v0, p4, v5

    goto :goto_0

    .line 373
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v0

    neg-int v0, v0

    goto :goto_1

    .line 381
    :cond_3
    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Landroid/view/View;I)V

    goto :goto_2

    .line 386
    :cond_4
    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c(I)V

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_1
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 3

    .prologue
    .line 412
    const/4 v0, 0x0

    .line 413
    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 414
    if-gez p5, :cond_4

    .line 415
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    if-gez v2, :cond_4

    .line 416
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    if-gt p5, v0, :cond_0

    .line 417
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result p5

    .line 423
    :cond_0
    :goto_0
    if-eqz p5, :cond_1

    .line 424
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    sub-int/2addr v0, p5

    if-lez v0, :cond_2

    .line 425
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    neg-int v0, v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Landroid/view/View;I)V

    .line 429
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTop()I

    move-result v0

    sub-int/2addr v0, p5

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    if-le v0, v2, :cond_3

    .line 430
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c(I)V

    .line 435
    :cond_1
    :goto_2
    return-void

    .line 427
    :cond_2
    neg-int v0, p5

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Landroid/view/View;I)V

    goto :goto_1

    .line 432
    :cond_3
    neg-int v0, p5

    invoke-direct {p0, v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c(I)V

    goto :goto_2

    :cond_4
    move p5, v0

    goto :goto_0
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 355
    const/4 v0, 0x0

    return v0
.end method

.method public setPadding(IIII)V
    .locals 0

    .prologue
    .line 821
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 822
    return-void
.end method

.method public setPaddingRelative(IIII)V
    .locals 0

    .prologue
    .line 831
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->setPaddingRelative(IIII)V

    .line 832
    return-void
.end method
