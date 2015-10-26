.class public Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Lbaq;
.implements Lbbt;


# static fields
.field private static u:Landroid/net/wifi/WifiManager;


# instance fields
.field private e:Lbah;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/Toast;

.field private final j:Landroid/os/Handler;

.field private k:Z

.field private l:J

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lbbn;

.field private final r:Lua;

.field private s:Ltx;

.field private final t:Lop;

.field private final v:Ljava/lang/Runnable;

.field private w:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Lmm;-><init>()V

    .line 82
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->j:Landroid/os/Handler;

    .line 94
    new-instance v0, Lbbk;

    .line 1259
    invoke-direct {v0, p0}, Lbbk;-><init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 94
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->r:Lua;

    .line 96
    new-instance v0, Lbbv;

    invoke-direct {v0}, Lbbv;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->t:Lop;

    .line 103
    new-instance v0, Lbbe;

    invoke-direct {v0, p0}, Lbbe;-><init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->v:Ljava/lang/Runnable;

    .line 452
    new-instance v0, Lbbh;

    invoke-direct {v0, p0}, Lbbh;-><init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->w:Landroid/content/BroadcastReceiver;

    .line 526
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Landroid/widget/Toast;)Landroid/widget/Toast;
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i:Landroid/widget/Toast;

    return-object p1
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i()V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 57
    const/4 v0, 0x0

    .line 10321
    new-instance v1, Lbbf;

    invoke-direct {v1, p0, p1, v0}, Lbbf;-><init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Ljava/lang/String;I)V

    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 57
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Z)Z
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->o:Z

    return v0
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h()V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Z)Z
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    return v0
.end method

.method public static synthetic c(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Landroid/app/PendingIntent;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 57
    .line 11256
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p0, v2, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 57
    return-object v0
.end method

.method public static synthetic d(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Lbbn;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    return-object v0
.end method

.method public static synthetic e(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Landroid/widget/Toast;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i:Landroid/widget/Toast;

    return-object v0
.end method

.method public static synthetic f(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->j()V

    return-void
.end method

.method public static synthetic g()Landroid/net/wifi/WifiManager;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->u:Landroid/net/wifi/WifiManager;

    return-object v0
.end method

.method public static synthetic g(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->o:Z

    return v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 285
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->v:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 286
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->l:J

    .line 287
    return-void
.end method

.method public static synthetic h(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 1

    .prologue
    .line 57
    .line 11357
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->m:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    if-nez v0, :cond_0

    .line 11358
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 12356
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->d:Z

    .line 11358
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 11359
    invoke-virtual {v0}, Lbbn;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 11360
    invoke-virtual {v0}, Lbbn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 11361
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->startMirroring(Landroid/view/View;)V

    .line 57
    :cond_0
    return-void
.end method

.method private i()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 293
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->k:Z

    if-nez v0, :cond_1

    .line 318
    :cond_0
    :goto_0
    return-void

    .line 296
    :cond_1
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h()V

    .line 297
    invoke-static {}, Ltz;->a()Ljava/util/List;

    move-result-object v0

    .line 298
    if-eqz v0, :cond_3

    .line 299
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 300
    invoke-virtual {v0}, Luh;->b()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->s:Ltx;

    invoke-virtual {v0, v2}, Luh;->a(Ltx;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 4808
    :cond_3
    iget-object v0, p0, Lm;->b:Lt;

    .line 306
    const-string v1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 307
    if-eqz v0, :cond_0

    .line 312
    check-cast v0, Li;

    .line 5167
    invoke-virtual {v0, v3}, Li;->a(Z)V

    .line 313
    sget v0, Lb;->at:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 314
    sget v1, Lb;->as:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v3

    .line 315
    invoke-virtual {p0, v1, v2}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 316
    invoke-static {p0}, Lblf;->F(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 314
    invoke-static {v1, v0, v2}, Lbbj;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbbj;

    move-result-object v0

    .line 5808
    iget-object v1, p0, Lm;->b:Lt;

    .line 317
    const-string v2, "castScreenAlertDialog"

    invoke-virtual {v0, v1, v2}, Li;->a(Lr;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static synthetic i(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    return v0
.end method

.method private j()V
    .locals 5

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 421
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    invoke-virtual {v0}, Lbbn;->b()Z

    move-result v3

    .line 422
    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->f:Landroid/widget/Button;

    if-eqz v3, :cond_4

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 423
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->g:Landroid/widget/Button;

    if-eqz v3, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 424
    if-eqz v3, :cond_2

    .line 425
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 8149
    iget-object v3, v0, Lbbn;->a:Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    iget-object v3, v0, Lbbn;->a:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_5

    .line 8150
    :cond_1
    sget v0, Lb;->au:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 425
    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 426
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->o:Z

    .line 428
    :cond_2
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i:Landroid/widget/Toast;

    if-eqz v0, :cond_3

    .line 429
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 430
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i:Landroid/widget/Toast;

    .line 432
    :cond_3
    return-void

    :cond_4
    move v0, v2

    .line 422
    goto :goto_0

    .line 8151
    :cond_5
    iget-object v3, v0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    if-eqz v3, :cond_6

    iget-object v3, v0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 9000
    iget-object v3, v3, Lcom/google/android/gms/cast/CastDevice;->e:Ljava/lang/String;

    .line 8152
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 8153
    sget v3, Lb;->av:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v0, v0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 10000
    iget-object v0, v0, Lcom/google/android/gms/cast/CastDevice;->e:Ljava/lang/String;

    .line 8154
    aput-object v0, v4, v2

    .line 8153
    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 8156
    :cond_6
    sget v0, Lb;->aw:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method private startMirroring()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x2710

    .line 382
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->m:Z

    .line 7808
    iget-object v0, p0, Lm;->b:Lt;

    .line 384
    invoke-static {}, Ltz;->d()Luh;

    move-result-object v1

    .line 385
    invoke-virtual {v1}, Luh;->b()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->s:Ltx;

    invoke-virtual {v1, v2}, Luh;->a(Ltx;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 386
    :cond_0
    const-string v1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 407
    :cond_1
    :goto_0
    return-void

    .line 391
    :cond_2
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h()V

    .line 392
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->j:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->v:Ljava/lang/Runnable;

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 393
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->l:J

    .line 395
    invoke-static {}, Lop;->b()Loh;

    move-result-object v1

    .line 396
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->s:Ltx;

    invoke-virtual {v1, v2}, Loh;->a(Ltx;)V

    .line 397
    const-string v2, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    invoke-virtual {v1, v0, v2}, Loh;->a(Lr;Ljava/lang/String;)V

    goto :goto_0

    .line 399
    :cond_3
    const-string v1, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    if-nez v1, :cond_1

    .line 403
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->t:Lop;

    .line 404
    invoke-virtual {v1}, Lop;->c()Loo;

    move-result-object v1

    .line 405
    const-string v2, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    invoke-virtual {v1, v0, v2}, Loo;->a(Lr;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastDevice;)V
    .locals 1

    .prologue
    .line 436
    new-instance v0, Lbbg;

    invoke-direct {v0, p0}, Lbbg;-><init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 450
    return-void
.end method

.method public final b_()Ljava/util/ArrayList;
    .locals 3

    .prologue
    .line 337
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 6142
    iget-object v1, v0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 339
    if-eqz v1, :cond_0

    .line 340
    new-instance v0, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 341
    new-instance v2, Lbko;

    invoke-direct {v2, v1}, Lbko;-><init>(Lcom/google/android/gms/cast/CastDevice;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    :goto_0
    return-object v0

    .line 343
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public disconnectMirroring(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    invoke-virtual {v0}, Lbbn;->c()V

    .line 411
    return-void
.end method

.method public final e()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 332
    invoke-static {p0}, Lblf;->O(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->d()V

    .line 229
    :goto_0
    return-void

    .line 227
    :cond_0
    invoke-super {p0}, Lmm;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 140
    invoke-super {p0, p1}, Lmm;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 141
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/content/res/Configuration;)V

    .line 142
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 112
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 113
    sget v0, La;->gi:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->setContentView(I)V

    .line 114
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 2077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 115
    sget v2, Lb;->bp:I

    invoke-virtual {v0, v2}, Lmj;->a(I)V

    .line 116
    invoke-static {p0}, Lbbn;->a(Landroid/content/Context;)Lbbn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 117
    new-instance v0, Lbah;

    sget-object v2, Lbat;->b:Lbat;

    invoke-direct {v0, p0, p0, v2}, Lbah;-><init>(Lmm;Lbaq;Lbat;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    .line 119
    sget v0, Lf;->cc:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->f:Landroid/widget/Button;

    .line 120
    sget v0, Lf;->aP:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->g:Landroid/widget/Button;

    .line 121
    sget v0, Lf;->cd:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h:Landroid/widget/TextView;

    .line 122
    if-eqz p1, :cond_1

    .line 123
    const-string v0, "chooserShown"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->m:Z

    .line 124
    if-eqz p1, :cond_2

    .line 125
    const-string v0, "warningShown"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_1
    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->n:Z

    .line 126
    if-eqz p1, :cond_0

    .line 127
    const-string v0, "wifiShown"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    .line 128
    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    sput-object v0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->u:Landroid/net/wifi/WifiManager;

    .line 130
    return-void

    :cond_1
    move v0, v1

    .line 123
    goto :goto_0

    :cond_2
    move v0, v1

    .line 125
    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->c()V

    .line 219
    invoke-super {p0}, Lmm;->onDestroy()V

    .line 220
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 241
    invoke-static {p1}, Lblx;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    const/4 v0, 0x1

    .line 244
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 249
    invoke-static {p1, p0}, Lblx;->a(ILm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    const/4 v0, 0x1

    .line 252
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    const/4 v0, 0x1

    .line 236
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 191
    invoke-super {p0}, Lmm;->onPause()V

    .line 192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->k:Z

    .line 193
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    invoke-virtual {v0, p0}, Lbbn;->b(Lbbt;)V

    .line 195
    :try_start_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 134
    invoke-super {p0, p1}, Lmm;->onPostCreate(Landroid/os/Bundle;)V

    .line 135
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    .line 2290
    iget-object v0, v0, Lbah;->c:Lmn;

    invoke-virtual {v0}, Lmn;->c()V

    .line 136
    return-void
.end method

.method public onResume()V
    .locals 4

    .prologue
    .line 175
    invoke-super {p0}, Lmm;->onResume()V

    .line 176
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->k:Z

    .line 177
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    invoke-virtual {v0, p0}, Lbbn;->a(Lbbt;)V

    .line 179
    iget-wide v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->l:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 180
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i()V

    .line 182
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->m:Z

    if-nez v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->w:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 186
    :cond_1
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->j()V

    .line 187
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 203
    const-string v0, "chooserShown"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->m:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 204
    const-string v0, "warningShown"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->n:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 205
    const-string v0, "wifiShown"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 206
    invoke-super {p0, p1}, Lmm;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 207
    return-void
.end method

.method public onStart()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 146
    invoke-super {p0}, Lmm;->onStart()V

    .line 147
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->a()V

    .line 148
    new-instance v0, Lty;

    invoke-direct {v0}, Lty;-><init>()V

    .line 150
    invoke-static {p0}, Lblf;->G(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 149
    invoke-static {v1}, La;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lty;->a(Ljava/lang/String;)Lty;

    move-result-object v0

    .line 152
    invoke-static {p0}, Lblf;->H(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-static {v1}, La;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lty;->a(Ljava/lang/String;)Lty;

    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lty;->a()Ltx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->s:Ltx;

    .line 154
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 3164
    iget-object v0, v0, Lbbn;->d:Ltz;

    .line 154
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->s:Ltx;

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->r:Lua;

    invoke-virtual {v0, v1, v2, v4}, Ltz;->a(Ltx;Lua;I)V

    .line 3808
    iget-object v0, p0, Lm;->b:Lt;

    .line 158
    const-string v1, "castScreenAlertDialog"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    if-nez v1, :cond_0

    .line 159
    invoke-static {p0}, Lblf;->D(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 160
    invoke-virtual {v1}, Lbbn;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->n:Z

    if-nez v1, :cond_1

    .line 162
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "CAST_SCREEN_DO_NOT_SHOW_WARNING"

    const/4 v3, 0x0

    .line 163
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    .line 164
    new-instance v1, Lbbi;

    invoke-direct {v1}, Lbbi;-><init>()V

    const-string v2, "castScreenAlertDialog"

    invoke-virtual {v1, v0, v2}, Lbbi;->a(Lr;Ljava/lang/String;)V

    .line 165
    iput-boolean v4, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->n:Z

    .line 171
    :cond_0
    :goto_0
    return-void

    .line 168
    :cond_1
    iput-boolean v4, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->o:Z

    goto :goto_0
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 211
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->q:Lbbn;

    .line 4164
    iget-object v0, v0, Lbbn;->d:Ltz;

    .line 211
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->r:Lua;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 212
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->b()V

    .line 213
    invoke-super {p0}, Lmm;->onStop()V

    .line 214
    return-void
.end method

.method public showTips(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 414
    invoke-static {p0}, Lblf;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->startActivity(Landroid/content/Intent;)V

    .line 415
    return-void
.end method

.method public startMirroring(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 369
    sget-object v0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->u:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getWifiState()I

    move-result v0

    .line 370
    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 372
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    .line 373
    new-instance v0, Lbbl;

    invoke-direct {v0}, Lbbl;-><init>()V

    .line 6808
    iget-object v1, p0, Lm;->b:Lt;

    .line 374
    const-string v2, "castScreenWifiDialog"

    invoke-virtual {v0, v1, v2}, Li;->a(Lr;Ljava/lang/String;)V

    .line 379
    :goto_0
    return-void

    .line 377
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->p:Z

    .line 378
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->startMirroring()V

    goto :goto_0
.end method
