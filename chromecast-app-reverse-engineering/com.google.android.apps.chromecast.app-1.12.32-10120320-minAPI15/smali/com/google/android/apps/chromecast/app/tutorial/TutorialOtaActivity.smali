.class public Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;
.super Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;
.source "PG"


# instance fields
.field private final i:J

.field private final j:J

.field private final k:Lblp;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:Z

.field private o:Landroid/os/Handler;

.field private p:Z

.field private final q:Ljava/lang/Runnable;

.field private r:Layq;

.field private final s:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    .line 98
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;-><init>()V

    .line 58
    new-instance v0, Lbjx;

    invoke-direct {v0, p0}, Lbjx;-><init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->q:Ljava/lang/Runnable;

    .line 69
    new-instance v0, Lbjy;

    invoke-direct {v0, p0}, Lbjy;-><init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->s:Ljava/lang/Runnable;

    .line 99
    new-instance v0, Lblp;

    const-string v1, "TutorialOtaActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->k:Lblp;

    .line 100
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 101
    invoke-static {v0}, Lblf;->l(Landroid/content/Context;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->i:J

    .line 102
    invoke-static {v0}, Lblf;->m(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->j:J

    .line 103
    return-void
.end method

.method public static a(Landroid/content/Context;Ldan;Lbdf;ZLaph;)Landroid/content/Intent;
    .locals 2

    .prologue
    .line 90
    invoke-static {p0, p1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->a(Landroid/content/Context;Ldan;)Landroid/content/Intent;

    move-result-object v0

    .line 91
    const-class v1, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 92
    const-string v1, "deviceConfig"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 93
    const-string v1, "scanForDevice"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 94
    const-string v1, "deviceSetupSession"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 95
    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->q:Ljava/lang/Runnable;

    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 29
    .line 2268
    invoke-virtual {p0, v3}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->b(Z)V

    .line 2269
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    .line 2270
    if-nez p1, :cond_0

    .line 2272
    sget v0, Lf;->cH:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lb;->az:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2273
    sget v0, Lf;->cI:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2274
    sget v0, Lf;->cG:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void

    .line 2277
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2278
    const-string v1, "hadError"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2279
    invoke-virtual {p0, v2, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->setResult(ILandroid/content/Intent;)V

    .line 2280
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->finish()V

    goto :goto_0
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)J
    .locals 2

    .prologue
    .line 29
    iget-wide v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->i:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 222
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    if-eqz v0, :cond_0

    .line 223
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    .line 224
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 226
    :cond_0
    return-void
.end method

.method public static synthetic d(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    return v0
.end method

.method public static synthetic e(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Layq;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->r:Layq;

    return-object v0
.end method

.method public static synthetic f(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->c()V

    return-void
.end method

.method public static synthetic g(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->l:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic h(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->s:Ljava/lang/Runnable;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 215
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->n:Z

    if-nez v0, :cond_0

    .line 216
    invoke-super {p0, p1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(I)V

    .line 219
    :cond_0
    return-void
.end method

.method protected final b()V
    .locals 1

    .prologue
    .line 208
    const/16 v0, 0x98

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->c(I)V

    .line 209
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->setResult(I)V

    .line 210
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->finish()V

    .line 211
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 190
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    if-nez v0, :cond_0

    .line 191
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->b()V

    .line 196
    :goto_0
    return-void

    .line 193
    :cond_0
    invoke-super {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onBackPressed()V

    .line 194
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->c()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 201
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->c()V

    .line 203
    invoke-super {p0, p1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onClick(Landroid/view/View;)V

    .line 204
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 107
    invoke-super {p0, p1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onCreate(Landroid/os/Bundle;)V

    .line 109
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    .line 114
    new-instance v0, Layq;

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Layq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->r:Layq;

    .line 117
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "deviceConfig"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lbdf;

    .line 1362
    iget-object v0, v0, Lbdf;->n:Ljava/lang/String;

    .line 118
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->l:Ljava/lang/String;

    .line 120
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "scanForDevice"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->n:Z

    .line 121
    if-eqz p1, :cond_2

    .line 122
    const-string v0, "applyingUpdate"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    .line 123
    const-string v0, "shouldAutoScroll"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    .line 133
    :goto_1
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->h:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->h:Landroid/widget/Button;

    .line 135
    sget v0, Lf;->cF:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 137
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->f:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lbjz;

    invoke-direct {v1, p0}, Lbjz;-><init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    .line 124
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->n:Z

    if-eqz v0, :cond_3

    .line 125
    iput-boolean v3, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    .line 126
    iput-boolean v3, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    goto :goto_1

    .line 128
    :cond_3
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    .line 129
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    goto :goto_1
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 176
    invoke-super {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onPause()V

    .line 177
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 180
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    .line 168
    invoke-super {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onResume()V

    .line 169
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->q:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->i:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 172
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 151
    invoke-super {p0, p1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 153
    const-string v0, "applyingUpdate"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 154
    const-string v0, "shouldAutoScroll"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->p:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 155
    return-void
.end method

.method protected onStart()V
    .locals 4

    .prologue
    .line 159
    invoke-super {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onStart()V

    .line 161
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->m:Z

    if-eqz v0, :cond_0

    .line 2233
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->s:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->j:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2236
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->r:Layq;

    new-instance v1, Layy;

    new-instance v2, Lbka;

    invoke-direct {v2, p0}, Lbka;-><init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V

    invoke-direct {v1, v2}, Layy;-><init>(Layw;)V

    invoke-virtual {v0, v1}, Layq;->a(Layw;)V

    .line 2258
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->r:Layq;

    invoke-virtual {v0}, Layq;->b()V

    .line 164
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 184
    invoke-super {p0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->onStop()V

    .line 2262
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->r:Layq;

    invoke-virtual {v0}, Layq;->c()V

    .line 2263
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->r:Layq;

    invoke-virtual {v0}, Layq;->a()V

    .line 2264
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 186
    return-void
.end method
