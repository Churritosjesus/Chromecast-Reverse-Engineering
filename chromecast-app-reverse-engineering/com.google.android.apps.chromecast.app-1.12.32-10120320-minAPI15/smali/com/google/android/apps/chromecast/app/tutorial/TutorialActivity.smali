.class public Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;
.super Lm;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lhx;


# instance fields
.field public e:Lbkb;

.field public f:Landroid/support/v4/view/ViewPager;

.field public g:Landroid/widget/Button;

.field public h:Landroid/widget/Button;

.field private final i:Lblp;

.field private j:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

.field private k:Landroid/widget/ImageButton;

.field private l:I

.field private m:Landroid/animation/Animator;

.field private n:I

.field private o:I

.field private p:Laph;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Lm;-><init>()V

    .line 42
    new-instance v0, Lblp;

    const-string v1, "TutorialActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->i:Lblp;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;)Landroid/animation/Animator;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->m:Landroid/animation/Animator;

    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->m:Landroid/animation/Animator;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ldan;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 63
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 64
    const-string v1, "tutorials"

    invoke-static {p1}, Ldan;->a(Ldew;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 65
    return-object v0
.end method

.method private a(Landroid/view/View;Z)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 255
    if-eqz p2, :cond_0

    .line 256
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 257
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 260
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz p2, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    :cond_1
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->l:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 261
    return-void
.end method

.method private d(I)V
    .locals 4

    .prologue
    .line 280
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    invoke-direct {v1, p1}, Lapd;-><init>(I)V

    iget v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->o:I

    .line 282
    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 12509
    iget v2, v2, Landroid/support/v4/view/ViewPager;->b:I

    .line 283
    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lapd;->a(J)Lapd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->p:Laph;

    .line 13115
    iput-object v2, v1, Lapd;->h:Laph;

    .line 280
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 285
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->e:Lbkb;

    .line 11031
    iget-object v0, v0, Lbkb;->b:[Ldap;

    array-length v0, v0

    .line 180
    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 181
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->b(Z)V

    .line 186
    :cond_0
    :goto_0
    return-void

    .line 182
    :cond_1
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->e:Lbkb;

    .line 12031
    iget-object v0, v0, Lbkb;->b:[Ldap;

    array-length v0, v0

    .line 183
    add-int/lit8 v0, v0, -0x2

    if-ne p1, v0, :cond_0

    .line 184
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->b(Z)V

    goto :goto_0
.end method

.method public final a(IFI)V
    .locals 0

    .prologue
    .line 271
    return-void
.end method

.method protected b()V
    .locals 1

    .prologue
    .line 174
    const/16 v0, 0x98

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->c(I)V

    .line 175
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->finish()V

    .line 176
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 266
    return-void
.end method

.method protected final b(Z)V
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 195
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 196
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->m:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->m:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getWidth()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 201
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getHeight()I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    .line 206
    if-eqz p1, :cond_2

    .line 208
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getWidth()I

    move-result v0

    .line 209
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 210
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->k:Landroid/widget/ImageButton;

    const/4 v6, 0x4

    invoke-virtual {v1, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    move v1, v2

    .line 219
    :goto_0
    iget-object v6, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    int-to-float v1, v1

    int-to-float v0, v0

    .line 220
    invoke-static {v6, v4, v5, v1, v0}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object v0

    .line 221
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->m:Landroid/animation/Animator;

    .line 223
    new-instance v1, Lbjw;

    invoke-direct {v1, p0, p1}, Lbjw;-><init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;Z)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 234
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 241
    :goto_1
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->h:Landroid/widget/Button;

    if-eqz v0, :cond_1

    .line 242
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->h:Landroid/widget/Button;

    if-nez p1, :cond_5

    :goto_2
    invoke-direct {p0, v0, v3}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(Landroid/view/View;Z)V

    .line 244
    :cond_1
    return-void

    .line 212
    :cond_2
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getWidth()I

    move-result v1

    .line 213
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->k:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 216
    iget-object v6, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->k:Landroid/widget/ImageButton;

    invoke-virtual {v6, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 237
    :cond_3
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-direct {p0, v0, p1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(Landroid/view/View;Z)V

    .line 238
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->k:Landroid/widget/ImageButton;

    if-nez p1, :cond_4

    move v0, v3

    :goto_3
    invoke-direct {p0, v1, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(Landroid/view/View;Z)V

    goto :goto_1

    :cond_4
    move v0, v2

    goto :goto_3

    :cond_5
    move v3, v2

    .line 242
    goto :goto_2
.end method

.method protected final c(I)V
    .locals 3

    .prologue
    .line 274
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    invoke-direct {v1, p1}, Lapd;-><init>(I)V

    iget v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->o:I

    .line 275
    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->p:Laph;

    .line 12115
    iput-object v2, v1, Lapd;->h:Laph;

    .line 274
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 277
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 144
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 6509
    iget v0, v0, Landroid/support/v4/view/ViewPager;->b:I

    .line 144
    if-eqz v0, :cond_0

    .line 145
    const/16 v0, 0x96

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->d(I)V

    .line 146
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 7509
    iget v1, v1, Landroid/support/v4/view/ViewPager;->b:I

    .line 146
    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 150
    :goto_0
    return-void

    .line 148
    :cond_0
    invoke-super {p0}, Lm;->onBackPressed()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 154
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 155
    sget v1, Lf;->cj:I

    if-ne v0, v1, :cond_1

    .line 157
    const/16 v0, 0x95

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->d(I)V

    .line 158
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 8509
    iget v1, v1, Landroid/support/v4/view/ViewPager;->b:I

    .line 159
    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->e:Lbkb;

    .line 9031
    iget-object v2, v2, Lbkb;->b:[Ldap;

    array-length v2, v2

    .line 159
    rem-int/2addr v1, v2

    .line 158
    invoke-virtual {v0, v1, v3}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 167
    :cond_0
    :goto_0
    return-void

    .line 160
    :cond_1
    sget v1, Lf;->dQ:I

    if-ne v0, v1, :cond_2

    .line 162
    const/16 v0, 0x97

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->d(I)V

    .line 163
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->e:Lbkb;

    .line 10031
    iget-object v1, v1, Lbkb;->b:[Ldap;

    array-length v1, v1

    .line 163
    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1, v3}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    goto :goto_0

    .line 164
    :cond_2
    sget v1, Lf;->aR:I

    if-ne v0, v1, :cond_0

    .line 165
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->b()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, -0x1

    .line 70
    invoke-super {p0, p1}, Lm;->onCreate(Landroid/os/Bundle;)V

    .line 71
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "deviceSetupSession"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Laph;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->p:Laph;

    .line 73
    const/4 v3, 0x0

    .line 75
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v4, "tutorials"

    invoke-virtual {v0, v4}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v0

    .line 1623
    new-instance v4, Ldan;

    invoke-direct {v4}, Ldan;-><init>()V

    invoke-static {v4, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldan;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    .line 80
    :goto_0
    if-nez v3, :cond_0

    .line 83
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->setResult(I)V

    .line 84
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->finish()V

    .line 129
    :goto_1
    return-void

    .line 76
    :catch_0
    move-exception v0

    .line 77
    new-array v4, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, v3, Ldan;->a:Ljava/lang/Long;

    if-eqz v0, :cond_5

    iget-object v0, v3, Ldan;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v0, v4

    :goto_2
    iput v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->o:I

    .line 88
    if-nez p1, :cond_1

    .line 89
    const/16 v0, 0x94

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->c(I)V

    .line 92
    :cond_1
    invoke-static {p0}, Lblx;->h(Landroid/app/Activity;)V

    .line 93
    sget v0, La;->gS:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->setContentView(I)V

    .line 96
    sget v0, Lf;->cj:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->k:Landroid/widget/ImageButton;

    .line 97
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->k:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    sget v0, Lf;->dQ:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->h:Landroid/widget/Button;

    .line 100
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->h:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    sget v0, Lf;->aR:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    .line 103
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    iget-object v4, v3, Ldan;->h:Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x10e0001

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->l:I

    .line 109
    new-instance v0, Lbkb;

    .line 1808
    iget-object v4, p0, Lm;->b:Lt;

    .line 109
    iget-object v5, v3, Ldan;->g:[Ldap;

    invoke-direct {v0, v4, v5}, Lbkb;-><init>(Lr;[Ldap;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->e:Lbkb;

    .line 110
    sget v0, Lf;->cM:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 111
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->e:Lbkb;

    invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->a(Lgn;)V

    .line 115
    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    iget-object v0, v3, Ldan;->g:[Ldap;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    .line 2725
    if-gtz v0, :cond_2

    .line 2726
    const-string v3, "ViewPager"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Requested offscreen page limit "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " too small; defaulting to 1"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 2730
    :cond_2
    iget v2, v4, Landroid/support/v4/view/ViewPager;->c:I

    if-eq v0, v2, :cond_3

    .line 2731
    iput v0, v4, Landroid/support/v4/view/ViewPager;->c:I

    .line 2732
    invoke-virtual {v4}, Landroid/support/v4/view/ViewPager;->b()V

    .line 117
    :cond_3
    sget v0, Lf;->cK:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->j:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    .line 118
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->j:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 3165
    iput-object v2, v0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a:Landroid/support/v4/view/ViewPager;

    .line 3591
    iput-object v0, v2, Landroid/support/v4/view/ViewPager;->d:Lhx;

    .line 4474
    iget-object v3, v2, Landroid/support/v4/view/ViewPager;->a:Lgn;

    .line 3167
    invoke-virtual {v3}, Lgn;->a()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c(I)V

    .line 5474
    iget-object v2, v2, Landroid/support/v4/view/ViewPager;->a:Lgn;

    .line 3168
    new-instance v3, Lczt;

    invoke-direct {v3, v0}, Lczt;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {v2, v3}, Lgn;->a(Landroid/database/DataSetObserver;)V

    .line 3174
    invoke-virtual {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a()V

    .line 119
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->j:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    .line 6185
    iput-object p0, v0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    .line 123
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->getRequestedOrientation()I

    move-result v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->n:I

    .line 124
    invoke-static {p0}, Lblx;->c(Landroid/app/Activity;)I

    move-result v0

    .line 125
    if-eq v0, v1, :cond_4

    .line 126
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->setRequestedOrientation(I)V

    .line 128
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    goto/16 :goto_1

    :cond_5
    move v0, v1

    .line 87
    goto/16 :goto_2
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 133
    invoke-super {p0}, Lm;->onDestroy()V

    .line 135
    iget v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->n:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->setRequestedOrientation(I)V

    .line 136
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 137
    return-void
.end method
