.class public final Lbah;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lbwh;
.implements Lbwn;


# instance fields
.field public final a:Landroid/support/v4/widget/DrawerLayout;

.field public final b:Landroid/widget/ArrayAdapter;

.field public final c:Lmn;

.field private d:Ljava/util/List;

.field private final e:Lblp;

.field private final f:Lmm;

.field private final g:Lbaq;

.field private h:I

.field private final i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

.field private final j:Landroid/widget/ListView;

.field private k:I

.field private final l:Landroid/os/Handler;

.field private m:Lcom/google/android/gms/common/api/GoogleApiClient;


# direct methods
.method public constructor <init>(Lmm;Lbaq;Lbat;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput v2, p0, Lbah;->k:I

    .line 123
    new-instance v0, Lblp;

    const-string v3, "ChromecastDrawer"

    invoke-direct {v0, v3, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbah;->e:Lblp;

    .line 124
    iput-object p1, p0, Lbah;->f:Lmm;

    .line 125
    iput-object p2, p0, Lbah;->g:Lbaq;

    .line 126
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbah;->l:Landroid/os/Handler;

    .line 128
    invoke-direct {p0, p3}, Lbah;->a(Lbat;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lbah;->d:Ljava/util/List;

    .line 130
    new-instance v0, Lbar;

    iget-object v3, p0, Lbah;->d:Ljava/util/List;

    invoke-direct {v0, p1, v3}, Lbar;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lbah;->b:Landroid/widget/ArrayAdapter;

    .line 132
    sget v0, Lf;->aW:I

    invoke-virtual {p1, v0}, Lmm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    iput-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    .line 133
    sget v0, Lf;->bF:I

    invoke-virtual {p1, v0}, Lmm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    iput-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    .line 135
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    sget v3, La;->ev:I

    .line 1412
    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const v4, 0x800003

    .line 2392
    invoke-static {v0}, Lgt;->g(Landroid/view/View;)I

    move-result v5

    invoke-static {v4, v5}, Lfe;->a(II)I

    move-result v4

    .line 2394
    and-int/lit8 v5, v4, 0x3

    const/4 v6, 0x3

    if-ne v5, v6, :cond_0

    .line 2395
    iput-object v3, v0, Landroid/support/v4/widget/DrawerLayout;->g:Landroid/graphics/drawable/Drawable;

    .line 2396
    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 2398
    :cond_0
    and-int/lit8 v4, v4, 0x5

    const/4 v5, 0x5

    if-ne v4, v5, :cond_1

    .line 2399
    iput-object v3, v0, Landroid/support/v4/widget/DrawerLayout;->h:Landroid/graphics/drawable/Drawable;

    .line 2400
    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 136
    :cond_1
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {p1}, Lmm;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, La;->ds:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 2421
    iput v3, v0, Landroid/support/v4/widget/DrawerLayout;->a:I

    .line 2422
    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 138
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 139
    invoke-virtual {p1}, Lmm;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, La;->dj:I

    invoke-virtual {v3, v4, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 140
    iget-object v3, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 3046
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v4, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v4, v3, Landroid/support/v4/widget/DrawerLayout;->i:Landroid/graphics/drawable/Drawable;

    .line 3047
    invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 142
    new-instance v0, Landroid/widget/ListView;

    invoke-direct {v0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    .line 143
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    iget-object v3, p0, Lbah;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 144
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 145
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 146
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 148
    new-instance v3, Lcqa;

    invoke-direct {v3}, Lcqa;-><init>()V

    .line 4000
    const/16 v0, 0x9e

    iput v0, v3, Lcqa;->a:I

    .line 5000
    iget v0, v3, Lcqa;->a:I

    if-ltz v0, :cond_a

    move v0, v1

    :goto_0
    const-string v4, "Must provide valid client application ID!"

    invoke-static {v0, v4}, La;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcpz;

    .line 6000
    invoke-direct {v0, v3}, Lcpz;-><init>(Lcqa;)V

    .line 151
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v3

    .line 152
    invoke-static {v3}, Lbls;->a(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 153
    new-instance v4, Lbwf;

    invoke-direct {v4, v3}, Lbwf;-><init>(Landroid/content/Context;)V

    sget-object v3, Lcpx;->b:Lbvz;

    .line 154
    invoke-virtual {v4, v3, v0}, Lbwf;->a(Lbvz;Lbwb;)Lbwf;

    move-result-object v0

    new-instance v3, Lbai;

    invoke-direct {v3, p0}, Lbai;-><init>(Lbah;)V

    .line 155
    invoke-virtual {v0, v3}, Lbwf;->a(Lbwg;)Lbwf;

    move-result-object v0

    .line 169
    invoke-virtual {v0, p0}, Lbwf;->a(Lbwh;)Lbwf;

    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lbwf;->b()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 171
    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    .line 172
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    iget-object v3, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 6674
    iput-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->j:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 6675
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    iget-object v4, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->j:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 7115
    iput-object v4, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 7116
    iget-object v4, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v4, :cond_2

    .line 7117
    new-instance v4, Lcqm;

    invoke-virtual {v3}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v6, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {v4, v5, v6}, Lcqm;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    iput-object v4, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->d:Lcqm;

    .line 6676
    :cond_2
    new-instance v3, Lcqj;

    invoke-virtual {v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->j:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {v3, v4, v5}, Lcqj;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    iput-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->k:Lcqj;

    .line 6677
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    iget-object v0, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->k:Lcqj;

    .line 7126
    iput-object v0, v3, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->e:Lcqj;

    .line 185
    :cond_3
    :goto_1
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    iget-object v3, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    .line 7788
    invoke-static {}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 7789
    invoke-static {v3}, Lgt;->r(Landroid/view/View;)Z

    move-result v4

    .line 7790
    if-eqz v4, :cond_4

    .line 7791
    const/16 v5, 0x37

    invoke-virtual {v0, v5}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->setForegroundGravity(I)V

    .line 7792
    new-instance v5, Lcqw;

    invoke-direct {v5}, Lcqw;-><init>()V

    iput-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->p:Lcqw;

    .line 7793
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->p:Lcqw;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 7797
    :cond_4
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    if-eqz v5, :cond_5

    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    invoke-static {v5}, Lgt;->r(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 7798
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    invoke-virtual {v5, v7}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 7799
    iput-object v7, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    .line 7803
    :cond_5
    if-eqz v4, :cond_6

    if-eqz v3, :cond_6

    .line 7804
    iput-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    .line 7805
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->q:Landroid/view/View;

    new-instance v4, Lcqi;

    .line 7846
    invoke-direct {v4, v0}, Lcqi;-><init>(Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;)V

    .line 7805
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 186
    :cond_6
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    iget-object v3, p0, Lbah;->j:Landroid/widget/ListView;

    .line 8254
    iget-object v4, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v4

    if-lez v4, :cond_7

    .line 8255
    iget-object v4, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 8257
    :cond_7
    iget-object v4, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v4, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 8258
    iput-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->m:Landroid/view/View;

    .line 8259
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v2}, Landroid/widget/FrameLayout;->setClipToPadding(Z)V

    .line 9110
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->m:Landroid/view/View;

    if-eqz v3, :cond_8

    invoke-static {}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 9111
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->m:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    .line 9112
    iget-object v3, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v2}, Landroid/widget/FrameLayout;->setNestedScrollingEnabled(Z)V

    .line 9113
    invoke-virtual {v0, v2}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->setNestedScrollingEnabled(Z)V

    .line 187
    :cond_8
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    new-instance v2, Lbaj;

    invoke-direct {v2, p0}, Lbaj;-><init>(Lbah;)V

    .line 9529
    iput-object v2, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a:Lcqf;

    .line 193
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    new-instance v2, Lbak;

    invoke-direct {v2, p0, p1}, Lbak;-><init>(Lbah;Lmm;)V

    .line 10515
    iput-object v2, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b:Lcqh;

    .line 199
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    new-instance v2, Lbal;

    invoke-direct {v2, p0, p1}, Lbal;-><init>(Lbah;Lmm;)V

    .line 10522
    iput-object v2, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->c:Lcqg;

    .line 11077
    invoke-virtual {p1}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 208
    if-eqz v0, :cond_9

    .line 209
    invoke-virtual {v0, v1}, Lmj;->b(Z)V

    .line 215
    :cond_9
    new-instance v0, Lbam;

    iget-object v3, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    sget v4, Lb;->bt:I

    sget v5, Lb;->bo:I

    move-object v1, p0

    move-object v2, p1

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lbam;-><init>(Lbah;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;IILmm;)V

    iput-object v0, p0, Lbah;->c:Lmn;

    .line 233
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lbah;->c:Lmn;

    .line 11432
    iput-object v1, v0, Landroid/support/v4/widget/DrawerLayout;->f:Lkt;

    .line 235
    iget-object v0, p0, Lbah;->d:Ljava/util/List;

    iget v1, p0, Lbah;->h:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbat;

    .line 236
    invoke-direct {p0, v0}, Lbah;->b(Lbat;)V

    .line 237
    return-void

    :cond_a
    move v0, v2

    .line 5000
    goto/16 :goto_0

    .line 177
    :cond_b
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 7396
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    .line 177
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 179
    invoke-static {v3}, Lbls;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 180
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 181
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method static synthetic a(Lbah;Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object v0
.end method

.method private a(Lbat;)Ljava/util/List;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 247
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {}, Lbat;->values()[Lbat;

    move-result-object v2

    array-length v2, v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 248
    sget-object v2, Lbat;->a:Lbat;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    invoke-static {}, Lblf;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 251
    sget-object v2, Lbat;->b:Lbat;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    :cond_0
    sget-object v2, Lbat;->c:Lbat;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    sget-object v2, Lbat;->d:Lbat;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    invoke-static {}, Lblf;->b()Z

    .line 260
    iput v0, p0, Lbah;->h:I

    .line 261
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 262
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_2

    .line 263
    iput v0, p0, Lbah;->h:I

    .line 268
    :cond_1
    return-object v1

    .line 261
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 331
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 332
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 334
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p1

    .line 335
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    .line 336
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    move-object v0, p1

    .line 337
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lbah;->a(Landroid/view/View;)V

    .line 336
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 339
    :cond_1
    instance-of v0, p1, Landroid/widget/AdapterView;

    if-nez v0, :cond_2

    .line 340
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 343
    :cond_2
    return-void
.end method

.method static synthetic a(Lbah;)V
    .locals 3

    .prologue
    .line 60
    .line 18485
    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 18486
    :cond_0
    :goto_0
    return-void

    .line 18489
    :cond_1
    new-instance v0, Lcpq;

    invoke-direct {v0}, Lcpq;-><init>()V

    .line 18490
    sget-object v1, Lcpx;->c:Lcpp;

    iget-object v2, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1, v2, v0}, Lcpp;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcpq;)Lbwj;

    move-result-object v0

    invoke-interface {v0, p0}, Lbwj;->a(Lbwn;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 4

    .prologue
    .line 419
    if-eqz p1, :cond_0

    .line 12444
    iget-object v0, p0, Lbah;->l:Landroid/os/Handler;

    new-instance v1, Lban;

    invoke-direct {v1, p0}, Lban;-><init>(Lbah;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 424
    :goto_0
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    iget v1, p0, Lbah;->h:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 425
    return-void

    .line 422
    :cond_0
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic b(Lbah;)Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    return-object v0
.end method

.method private b(Lbat;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 374
    iget-object v0, p0, Lbah;->d:Ljava/util/List;

    iget v1, p0, Lbah;->h:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 375
    const/4 v0, 0x0

    .line 376
    sget-object v1, Lbap;->a:[I

    invoke-virtual {p1}, Lbat;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 400
    :goto_0
    if-eqz v0, :cond_0

    .line 401
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lbah;->f:Lmm;

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 403
    iget-object v0, p0, Lbah;->f:Lmm;

    invoke-virtual {v0, v1}, Lmm;->startActivity(Landroid/content/Intent;)V

    .line 404
    iget-object v0, p0, Lbah;->f:Lmm;

    invoke-virtual {v0}, Lmm;->finish()V

    .line 405
    iget-object v0, p0, Lbah;->f:Lmm;

    const/high16 v1, 0x10a0000

    const v2, 0x10a0001

    invoke-virtual {v0, v1, v2}, Lmm;->overridePendingTransition(II)V

    .line 414
    :goto_1
    return-void

    .line 378
    :pswitch_0
    const-class v0, Lcom/google/android/apps/chromecast/app/MainActivity;

    goto :goto_0

    .line 381
    :pswitch_1
    invoke-direct {p0, v3}, Lbah;->a(Z)V

    .line 382
    iget-object v0, p0, Lbah;->f:Lmm;

    invoke-static {v0}, Lblx;->d(Landroid/app/Activity;)V

    goto :goto_1

    .line 385
    :pswitch_2
    const-class v0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    goto :goto_0

    .line 388
    :pswitch_3
    iput v3, p0, Lbah;->k:I

    .line 389
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbah;->a(Z)V

    goto :goto_1

    .line 392
    :pswitch_4
    invoke-static {}, Lblf;->b()Z

    goto :goto_0

    .line 412
    :cond_0
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    iget v1, p0, Lbah;->h:I

    invoke-virtual {v0, v1, v3}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 413
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)V

    goto :goto_1

    .line 376
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic c(Lbah;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 60
    .line 19273
    iget-object v0, p0, Lbah;->f:Lmm;

    .line 20188
    invoke-virtual {v0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 19275
    iget v0, p0, Lbah;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 19276
    iget-object v0, p0, Lbah;->f:Lmm;

    iget-object v1, p0, Lbah;->g:Lbaq;

    invoke-static {v0, v1}, Lbkq;->a(Landroid/app/Activity;Lbaq;)V

    .line 19278
    :cond_0
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(I)V

    .line 19279
    iput v2, p0, Lbah;->k:I

    .line 60
    return-void
.end method

.method static synthetic d(Lbah;)Landroid/support/v4/widget/DrawerLayout;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    return-object v0
.end method

.method static synthetic e(Lbah;)Lmm;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lbah;->f:Lmm;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 309
    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    .line 311
    :cond_0
    return-void
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 295
    iget-object v0, p0, Lbah;->c:Lmn;

    .line 12263
    invoke-virtual {v0}, Lmn;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Lmn;->c:Landroid/graphics/drawable/Drawable;

    .line 12265
    invoke-virtual {v0}, Lmn;->c()V

    .line 296
    return-void
.end method

.method public final synthetic a(Lbwm;)V
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    .line 60
    check-cast p1, Lcpr;

    .line 12495
    invoke-interface {p1}, Lcpr;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 12496
    new-array v0, v7, [Ljava/lang/Object;

    invoke-interface {p1}, Lcpr;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    aput-object v1, v0, v8

    .line 12517
    :cond_0
    :goto_0
    return-void

    .line 12500
    :cond_1
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 13396
    iget-object v3, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    .line 12503
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12504
    invoke-interface {p1}, Lcpr;->c()Lcsr;

    move-result-object v0

    invoke-virtual {v0}, Lcsr;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v1, v2

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    .line 12505
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12506
    invoke-interface {v0}, Lcsq;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    :goto_2
    move-object v1, v0

    .line 12509
    goto :goto_1

    .line 12510
    :cond_2
    new-array v0, v7, [Ljava/lang/Object;

    aput-object v4, v0, v8

    .line 12511
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    .line 14448
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    if-nez v5, :cond_4

    .line 14449
    new-instance v5, Lcqs;

    invoke-virtual {v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->getContext()Landroid/content/Context;

    move-result-object v6

    iget v7, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->l:I

    invoke-direct {v5, v6, v7, v2, v2}, Lcqs;-><init>(Landroid/content/Context;ILcqv;Ls;)V

    iput-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    .line 14451
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    .line 15338
    iput-boolean v8, v5, Lcqs;->d:Z

    .line 14452
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    iget-object v6, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->k:Lcqj;

    .line 16096
    iput-object v6, v5, Lcqs;->a:Lcqj;

    .line 14453
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->f:Landroid/widget/ListView;

    iget-object v6, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 14454
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    iget-boolean v6, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->n:Z

    .line 16100
    iget-boolean v7, v5, Lcqs;->b:Z

    if-eq v7, v6, :cond_3

    .line 16101
    iput-boolean v6, v5, Lcqs;->b:Z

    .line 16102
    invoke-virtual {v5}, Lcqs;->notifyDataSetChanged()V

    .line 14455
    :cond_3
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    iget-boolean v6, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->o:Z

    .line 16107
    iget-boolean v7, v5, Lcqs;->c:Z

    if-eq v7, v6, :cond_4

    .line 16108
    iput-boolean v6, v5, Lcqs;->c:Z

    .line 16109
    invoke-virtual {v5}, Lcqs;->notifyDataSetChanged()V

    .line 14457
    :cond_4
    iput-object v4, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    .line 14459
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    if-nez v5, :cond_5

    .line 14460
    iput-object v2, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->d:Lcsq;

    .line 16474
    :cond_5
    invoke-virtual {v0, v2, v8}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Lcsq;Z)V

    .line 14463
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->i:Lcqs;

    iget-object v6, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->e:Ljava/util/List;

    invoke-virtual {v5, v6}, Lcqs;->a(Ljava/util/List;)V

    .line 14464
    iget-object v0, v0, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->h:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    .line 17009
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->l:Landroid/animation/AnimatorSet;

    if-eqz v5, :cond_6

    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 17010
    iput-object v2, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->m:Lcsq;

    .line 17011
    iput-object v2, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->n:Lcsq;

    .line 12512
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_a

    .line 12513
    if-eqz v3, :cond_0

    .line 12514
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 17014
    :cond_6
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->f:Ljava/util/ArrayList;

    if-nez v5, :cond_9

    .line 17015
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->f:Ljava/util/ArrayList;

    .line 17019
    :goto_4
    if-eqz v2, :cond_7

    .line 17020
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->f:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17022
    :cond_7
    if-eqz v2, :cond_8

    .line 17023
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->f:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17025
    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->b()V

    goto :goto_3

    .line 17017
    :cond_9
    iget-object v5, v0, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->f:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    goto :goto_4

    .line 12516
    :cond_a
    if-eqz v1, :cond_b

    .line 12517
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    .line 17474
    invoke-virtual {v0, v1, v8}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Lcsq;Z)V

    goto/16 :goto_0

    .line 12521
    :cond_b
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    .line 12522
    iget-object v1, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    .line 18474
    invoke-virtual {v1, v0, v8}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Lcsq;Z)V

    .line 12523
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-interface {v0}, Lcsq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_c
    move-object v0, v1

    goto/16 :goto_2
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    .line 471
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 473
    iget-object v0, p0, Lbah;->f:Lmm;

    new-instance v1, Lbao;

    invoke-direct {v1, p0}, Lbao;-><init>(Lbah;)V

    invoke-static {v0, p1, v1}, Lbls;->a(Lm;Lcom/google/android/gms/common/ConnectionResult;Lblu;)V

    .line 482
    return-void
.end method

.method public final a(Landroid/view/MenuItem;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 301
    iget-object v2, p0, Lbah;->c:Lmn;

    .line 12278
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    const v4, 0x102002c

    if-ne v3, v4, :cond_0

    iget-boolean v3, v2, Lmn;->d:Z

    if-eqz v3, :cond_0

    .line 12279
    invoke-virtual {v2}, Lmn;->d()V

    move v2, v0

    .line 301
    :goto_0
    if-eqz v2, :cond_1

    .line 304
    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 12282
    goto :goto_0

    :cond_1
    move v0, v1

    .line 304
    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    :cond_0
    iget-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->c()V

    .line 317
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 324
    const/4 v0, 0x0

    iput-object v0, p0, Lbah;->m:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 325
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b()V

    .line 326
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    invoke-direct {p0, v0}, Lbah;->a(Landroid/view/View;)V

    .line 327
    iget-object v0, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-direct {p0, v0}, Lbah;->a(Landroid/view/View;)V

    .line 328
    return-void
.end method

.method public final d()V
    .locals 3

    .prologue
    .line 358
    invoke-virtual {p0}, Lbah;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 364
    :goto_0
    return-void

    .line 362
    :cond_0
    iget-object v0, p0, Lbah;->j:Landroid/widget/ListView;

    iget v1, p0, Lbah;->h:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 363
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 435
    iget-object v0, p0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lbah;->i:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->e(Landroid/view/View;)V

    .line 436
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    .line 368
    iget-object v0, p0, Lbah;->d:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbat;

    invoke-direct {p0, v0}, Lbah;->b(Lbat;)V

    .line 369
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x72

    .line 370
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lapd;-><init>(ILjava/lang/Integer;)V

    .line 369
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 371
    return-void
.end method
