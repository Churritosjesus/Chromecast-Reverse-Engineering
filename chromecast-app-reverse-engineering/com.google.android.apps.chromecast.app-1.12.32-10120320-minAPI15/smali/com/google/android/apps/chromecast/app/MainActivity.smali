.class public Lcom/google/android/apps/chromecast/app/MainActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Lami;
.implements Laoq;
.implements Laou;
.implements Laov;
.implements Laxb;
.implements Laxm;
.implements Lbaq;


# instance fields
.field public e:Landroid/app/AlertDialog;

.field public f:Lbah;

.field private g:I

.field private final h:Ljava/util/List;

.field private i:Landroid/view/View;

.field private j:Layz;

.field private k:Laxd;

.field private l:Lbcn;

.field private m:Lalm;

.field private n:Landroid/net/wifi/WifiManager;

.field private o:Landroid/support/v4/view/ViewPager;

.field private p:Lanb;

.field private q:Lama;

.field private r:Z

.field private s:Landroid/content/BroadcastReceiver;

.field private t:Lblp;

.field private u:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 167
    invoke-direct {p0}, Lmm;-><init>()V

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    .line 168
    new-instance v0, Lblp;

    const-string v1, "MainActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->t:Lblp;

    .line 169
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/MainActivity;I)I
    .locals 0

    .prologue
    .line 70
    iput p1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    return p1
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/MainActivity;Lama;)Lama;
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->q:Lama;

    return-object p1
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/MainActivity;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->e:Landroid/app/AlertDialog;

    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/MainActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/MainActivity;Z)Z
    .locals 0

    .prologue
    .line 70
    iput-boolean p1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->r:Z

    return p1
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/MainActivity;I)I
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->u:I

    return v0
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/MainActivity;)Lama;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->q:Lama;

    return-object v0
.end method

.method public static synthetic c(Lcom/google/android/apps/chromecast/app/MainActivity;)Lblp;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->t:Lblp;

    return-object v0
.end method

.method public static synthetic d(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbah;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    return-object v0
.end method

.method public static synthetic e(Lcom/google/android/apps/chromecast/app/MainActivity;)Lalm;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->m:Lalm;

    return-object v0
.end method

.method public static synthetic f(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbcn;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->l:Lbcn;

    return-object v0
.end method

.method public static synthetic g(Lcom/google/android/apps/chromecast/app/MainActivity;)Z
    .locals 1

    .prologue
    .line 70
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->r:Z

    return v0
.end method

.method public static synthetic h(Lcom/google/android/apps/chromecast/app/MainActivity;)Layz;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->j:Layz;

    return-object v0
.end method

.method public static synthetic i(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->n()V

    return-void
.end method

.method private n()V
    .locals 1

    .prologue
    .line 554
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->q:Lama;

    if-eqz v0, :cond_0

    .line 555
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->q:Lama;

    invoke-virtual {v0}, Lama;->q()V

    .line 557
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Layz;
    .locals 3

    .prologue
    .line 297
    .line 10808
    iget-object v1, p0, Lm;->b:Lt;

    .line 298
    const-string v0, "scannerFragment"

    .line 299
    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Layz;

    .line 300
    if-nez v0, :cond_0

    .line 303
    new-instance v0, Layz;

    invoke-direct {v0}, Layz;-><init>()V

    .line 304
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    const-string v2, "scannerFragment"

    invoke-virtual {v1, v0, v2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v1

    invoke-virtual {v1}, Laf;->b()I

    .line 306
    :cond_0
    return-object v0
.end method

.method public final a(Lana;)V
    .locals 3

    .prologue
    .line 667
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 668
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->a(I)V

    .line 669
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ldbb;)V
    .locals 4

    .prologue
    .line 652
    const/16 v0, 0x77

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    .line 17079
    iput-object p1, v0, Lapg;->c:Ljava/lang/String;

    .line 17084
    iput-object p2, v0, Lapg;->b:Ljava/lang/String;

    .line 655
    invoke-virtual {v0}, Lapg;->b()V

    .line 657
    const/4 v0, 0x0

    invoke-static {p1, p3, v0}, Lawr;->a(Ljava/lang/String;Ldbb;Z)Lawr;

    move-result-object v0

    .line 17808
    iget-object v1, p0, Lm;->b:Lt;

    .line 658
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->bk:I

    const-string v3, "detailsFragment"

    .line 659
    invoke-virtual {v1, v2, v0, v3}, Laf;->a(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    const/16 v1, 0x1001

    .line 660
    invoke-virtual {v0, v1}, Laf;->a(I)Laf;

    move-result-object v0

    const-string v1, "MainActivity"

    .line 661
    invoke-virtual {v0, v1}, Laf;->a(Ljava/lang/String;)Laf;

    move-result-object v0

    .line 662
    invoke-virtual {v0}, Laf;->b()I

    .line 663
    return-void
.end method

.method public final b_()Ljava/util/ArrayList;
    .locals 4

    .prologue
    .line 578
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 579
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->m:Lalm;

    invoke-virtual {v0}, Lalm;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 580
    new-instance v3, Lbko;

    invoke-direct {v3, v0}, Lbko;-><init>(Laow;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 582
    :cond_0
    return-object v1
.end method

.method public final e()Landroid/content/Intent;
    .locals 4

    .prologue
    .line 561
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    iget v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lana;->b:Lana;

    if-ne v0, v1, :cond_0

    .line 562
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/HelpActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 563
    const-string v1, "stringTitle"

    sget v2, Lb;->bk:I

    .line 564
    invoke-virtual {p0, v2}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 563
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 565
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    sget v3, Lb;->dF:I

    .line 566
    invoke-virtual {p0, v3}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget v3, Lb;->dG:I

    invoke-virtual {p0, v3}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 567
    const-string v2, "urlPatternLink"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 568
    const-string v1, "stringBody"

    sget v2, Lb;->bj:I

    .line 569
    invoke-virtual {p0, v2}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 568
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 572
    :goto_0
    return-object v0

    :cond_0
    sget v0, Lb;->dG:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_0
.end method

.method public enableWifi(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 589
    new-instance v0, Lapd;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lapd;-><init>(I)V

    .line 590
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    invoke-virtual {v0, v3}, Lapd;->a(I)Lapd;

    move-result-object v0

    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 591
    sget v0, Lb;->dB:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 593
    new-instance v0, Lamz;

    invoke-direct {v0, p0}, Lamz;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    .line 605
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.wifi.supplicant.CONNECTION_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 610
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->n:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v3}, Landroid/net/wifi/WifiManager;->setWifiEnabled(Z)Z

    .line 611
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->n()V

    .line 612
    return-void
.end method

.method public final g()Laxd;
    .locals 1

    .prologue
    .line 323
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->k:Laxd;

    return-object v0
.end method

.method public final h()Lbcn;
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->l:Lbcn;

    return-object v0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 407
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 408
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 412
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 413
    return-void
.end method

.method public final k()Z
    .locals 2

    .prologue
    .line 544
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->n:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getWifiState()I

    move-result v0

    .line 545
    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 618
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 629
    :cond_0
    :goto_0
    return-void

    .line 621
    :cond_1
    iget v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->u:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->u:I

    .line 622
    iget v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->u:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    .line 623
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(I)V

    .line 624
    sget v0, Lb;->aI:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 627
    sget-object v0, Lana;->b:Lana;

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Landroid/content/Context;Lana;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public final m()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 644
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 645
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->finish()V

    .line 646
    invoke-virtual {p0, v2, v2}, Lcom/google/android/apps/chromecast/app/MainActivity;->overridePendingTransition(II)V

    .line 647
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 633
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    invoke-virtual {v0}, Lbah;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 634
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    invoke-virtual {v0}, Lbah;->d()V

    .line 638
    :goto_0
    return-void

    .line 636
    :cond_0
    invoke-super {p0}, Lmm;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 385
    invoke-super {p0, p1}, Lmm;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 386
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/content/res/Configuration;)V

    .line 387
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x1

    .line 173
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 175
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 176
    const-string v1, "content_whatson_enabled"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 177
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    sget-object v2, Lana;->a:Lana;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    :cond_0
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    sget-object v2, Lana;->b:Lana;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    const-string v1, "content_getapps_enabled"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    sget-object v1, Lana;->c:Lana;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    :cond_1
    sget v0, La;->gh:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->setContentView(I)V

    .line 1416
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1417
    const-string v1, "content_search_enabled"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1418
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1419
    sget v0, Lf;->dv:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    .line 1421
    sget v0, Lf;->du:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1422
    sget v0, Lf;->aX:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1423
    new-instance v2, Lams;

    invoke-direct {v2, p0, v0, v1}, Lams;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;Landroid/widget/ImageView;Landroid/view/View;)V

    .line 1450
    new-instance v3, Lamv;

    invoke-direct {v3, p0}, Lamv;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1457
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    sget v3, Lf;->f:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SearchView;

    invoke-static {p0, v0, v1, v2}, Lblx;->a(Landroid/app/Activity;Landroid/support/v7/widget/SearchView;Landroid/view/View;Landroid/view/View$OnFocusChangeListener;)V

    .line 187
    :goto_0
    new-instance v0, Lbah;

    sget-object v1, Lbat;->a:Lbat;

    invoke-direct {v0, p0, p0, v1}, Lbah;-><init>(Lmm;Lbaq;Lbat;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    .line 190
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a()Layz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->j:Layz;

    .line 2808
    iget-object v1, p0, Lm;->b:Lt;

    .line 2312
    const-string v0, "backdropScannerFragment"

    .line 2313
    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Laqu;

    .line 2314
    if-nez v0, :cond_2

    .line 2315
    new-instance v0, Laqu;

    invoke-direct {v0}, Laqu;-><init>()V

    .line 2316
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    const-string v2, "backdropScannerFragment"

    invoke-virtual {v1, v0, v2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 192
    :cond_2
    new-instance v0, Laxd;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Laxd;-><init>(Landroid/content/Context;Latf;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->k:Laxd;

    .line 193
    invoke-static {p0}, Lblr;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 194
    new-instance v1, Lbcn;

    .line 195
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v2

    invoke-direct {v1, v2, v0, p1}, Lbcn;-><init>(Latf;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->l:Lbcn;

    .line 197
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->m:Lalm;

    .line 198
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->m:Lalm;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->l:Lbcn;

    .line 3214
    iget-object v2, v0, Lalm;->f:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3215
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 3622
    iget-object v3, v0, Laow;->q:Ljava/lang/String;

    .line 3216
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 3217
    invoke-interface {v1, v0}, Lalt;->a(Laow;)V

    goto :goto_1

    .line 1460
    :cond_4
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    .line 1461
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    sget v1, Lb;->M:I

    .line 1559
    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Ljava/lang/CharSequence;)V

    .line 1462
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 1463
    sget v0, Lf;->dv:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1465
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->i:Landroid/view/View;

    new-instance v1, Lamw;

    invoke-direct {v1, p0}, Lamw;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 200
    :cond_5
    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->n:Landroid/net/wifi/WifiManager;

    .line 201
    invoke-static {p0}, Lblr;->a(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->r:Z

    .line 4483
    new-instance v0, Lamx;

    invoke-direct {v0, p0}, Lamx;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->s:Landroid/content/BroadcastReceiver;

    .line 205
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 5462
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->b:Z

    .line 205
    if-nez v0, :cond_6

    .line 207
    sget-object v0, Lana;->b:Lana;

    move-object v2, v0

    .line 218
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v0, "android.intent.action.SEARCH"

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 5808
    iget-object v0, p0, Lm;->b:Lt;

    .line 219
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    new-instance v1, Lbgb;

    invoke-direct {v1}, Lbgb;-><init>()V

    const/4 v2, 0x0

    .line 220
    invoke-virtual {v0, v1, v2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 272
    :goto_3
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 8383
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->f:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    return-void

    .line 208
    :cond_6
    if-eqz p1, :cond_7

    .line 209
    invoke-static {}, Lana;->values()[Lana;

    move-result-object v0

    const-string v1, "tabIndex"

    sget-object v2, Lana;->a:Lana;

    .line 210
    invoke-virtual {v2}, Lana;->ordinal()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    aget-object v0, v0, v1

    move-object v2, v0

    goto :goto_2

    .line 211
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 212
    invoke-static {}, Lana;->values()[Lana;

    move-result-object v0

    .line 213
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "tabIndex"

    sget-object v3, Lana;->a:Lana;

    invoke-virtual {v3}, Lana;->ordinal()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    aget-object v0, v0, v1

    move-object v2, v0

    goto :goto_2

    .line 215
    :cond_8
    sget-object v0, Lana;->a:Lana;

    move-object v2, v0

    goto :goto_2

    .line 222
    :cond_9
    sget v0, Lf;->dS:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    .line 223
    sget v1, Lf;->cL:I

    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ViewPager;

    iput-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    .line 224
    new-instance v1, Lanb;

    invoke-direct {v1, p0}, Lanb;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    iput-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->p:Lanb;

    .line 225
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v3, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->p:Lanb;

    invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->a(Lgn;)V

    .line 226
    new-instance v1, Lamo;

    invoke-direct {v1, p0}, Lamo;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    .line 6126
    iget-object v3, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    .line 7091
    iput-object v1, v3, Lboh;->a:Lbof;

    .line 7092
    invoke-virtual {v3}, Lboh;->invalidate()V

    .line 238
    sget v1, La;->gO:I

    sget v3, Lf;->eg:I

    .line 7164
    iput v1, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a:I

    .line 7165
    iput v3, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b:I

    .line 239
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    .line 7173
    iget-object v3, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v3}, Lboh;->removeAllViews()V

    .line 7175
    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->c:Landroid/support/v4/view/ViewPager;

    .line 7176
    if-eqz v1, :cond_a

    .line 7177
    new-instance v3, Lbod;

    .line 7286
    invoke-direct {v3, v0}, Lbod;-><init>(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)V

    .line 7591
    iput-object v3, v1, Landroid/support/v4/view/ViewPager;->d:Lhx;

    .line 7178
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a()V

    .line 240
    :cond_a
    new-instance v1, Lamq;

    invoke-direct {v1, p0}, Lamq;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    .line 8154
    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->d:Lhx;

    .line 255
    new-instance v1, Lamr;

    invoke-direct {v1, p0}, Lamr;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    .line 8213
    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->e:Lbog;

    .line 266
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->h:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    .line 267
    iget v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_b

    .line 268
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    .line 270
    :cond_b
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->g:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->a(I)V

    goto/16 :goto_3
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 277
    invoke-super {p0}, Lmm;->onDestroy()V

    .line 278
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 8387
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->f:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 279
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->m:Lalm;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->l:Lbcn;

    .line 9223
    iget-object v0, v0, Lalm;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 280
    return-void
.end method

.method public onGetHelpClicked(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 475
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->e()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 476
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 399
    invoke-static {p1}, Lblx;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 400
    const/4 v0, 0x1

    .line 402
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
    .line 391
    invoke-static {p1, p0}, Lblx;->a(ILm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 392
    const/4 v0, 0x1

    .line 394
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
    .line 357
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    const/4 v0, 0x1

    .line 360
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 365
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->j:Layz;

    .line 15159
    const/4 v1, 0x0

    iput-object v1, v0, Layz;->a:Lazf;

    .line 366
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 367
    invoke-super {p0}, Lmm;->onPause()V

    .line 368
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 379
    invoke-super {p0, p1}, Lmm;->onPostCreate(Landroid/os/Bundle;)V

    .line 380
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    .line 16290
    iget-object v0, v0, Lbah;->c:Lmn;

    invoke-virtual {v0}, Lmn;->c()V

    .line 381
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 284
    invoke-super {p0, p1}, Lmm;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 285
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->k:Laxd;

    .line 10117
    const-string v0, "lastUpdatedTime"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Laxd;->l:J

    .line 10119
    :try_start_0
    const-string v0, "browseContent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10120
    const-string v0, "browseContent"

    .line 10121
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 10120
    invoke-static {v0}, Ldat;->a([B)Ldat;

    move-result-object v0

    iput-object v0, v1, Laxd;->c:Ldat;

    .line 10122
    const-string v0, "browseScrollPositions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0

    iput-object v0, v1, Laxd;->e:[I

    .line 10124
    :cond_0
    const-string v0, "getAppsContent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10125
    const-string v0, "getAppsContent"

    .line 10126
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 10125
    invoke-static {v0}, Ldat;->a([B)Ldat;

    move-result-object v0

    iput-object v0, v1, Laxd;->d:Ldat;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 10130
    :cond_1
    :goto_0
    return-void

    .line 10128
    :catch_0
    move-exception v0

    .line 10129
    iget-object v1, v1, Laxd;->f:Lblp;

    const-string v2, "Error parsing content bundle: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 340
    invoke-super {p0}, Lmm;->onResume()V

    .line 342
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 343
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->u:I

    .line 344
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->s:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.wifi.STATE_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 346
    sget v0, La;->br:I

    .line 347
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 348
    if-eqz v0, :cond_0

    .line 349
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    invoke-virtual {v0}, Landroid/widget/TextView;->clearFocus()V

    .line 12535
    :cond_0
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 13462
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->b:Z

    .line 12535
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12536
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->j:Layz;

    .line 14175
    const/4 v1, 0x1

    iput-boolean v1, v0, Layz;->b:Z

    .line 14176
    invoke-virtual {v0}, Layz;->p()V

    .line 353
    :cond_1
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 290
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->k:Laxd;

    .line 10134
    iget-object v1, v0, Laxd;->c:Ldat;

    if-eqz v1, :cond_0

    .line 10135
    const-string v1, "browseContent"

    iget-object v2, v0, Laxd;->c:Ldat;

    invoke-static {v2}, Ldat;->a(Ldew;)[B

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 10136
    const-string v1, "browseScrollPositions"

    iget-object v2, v0, Laxd;->e:[I

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 10138
    :cond_0
    iget-object v1, v0, Laxd;->d:Ldat;

    if-eqz v1, :cond_1

    .line 10139
    const-string v1, "getAppsContent"

    iget-object v2, v0, Laxd;->d:Ldat;

    invoke-static {v2}, Ldat;->a(Ldew;)[B

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 10141
    :cond_1
    const-string v1, "lastUpdatedTime"

    iget-wide v2, v0, Laxd;->l:J

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 291
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->l:Lbcn;

    .line 10165
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "hiddenOffers"

    const-string v3, ","

    iget-object v4, v0, Lbcn;->d:Ljava/util/Set;

    .line 10166
    invoke-interface {v4}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 10167
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 10168
    iget-object v1, v0, Lbcn;->c:Ljava/util/Set;

    if-eqz v1, :cond_2

    .line 10169
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10170
    iget-object v2, v0, Lbcn;->c:Ljava/util/Set;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 10171
    const-string v2, "getAppsOffers"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 10174
    :cond_2
    iget-object v1, v0, Lbcn;->b:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_3

    .line 10176
    iget-object v0, v0, Lbcn;->b:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 292
    :cond_3
    invoke-super {p0, p1}, Lmm;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 293
    return-void
.end method

.method protected onStart()V
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 333
    invoke-super {p0}, Lmm;->onStart()V

    .line 334
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    invoke-virtual {v1}, Lbah;->a()V

    .line 335
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->k:Laxd;

    .line 11148
    iget-object v2, v1, Laxd;->a:Landroid/content/Context;

    invoke-static {v2}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v2

    .line 11614
    iget-object v3, v2, Latf;->f:Ldax;

    if-nez v3, :cond_0

    .line 11148
    :goto_0
    iput-boolean v0, v1, Laxd;->n:Z

    .line 11149
    iget-object v0, v1, Laxd;->o:Landroid/os/Handler;

    iget-object v1, v1, Laxd;->p:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 336
    return-void

    .line 11618
    :cond_0
    iget-object v3, v2, Latf;->a:Landroid/content/Context;

    iget-object v4, v2, Latf;->g:Ldaz;

    .line 11619
    invoke-static {v3, v4}, Lblx;->a(Landroid/content/Context;Ldaz;)Ljava/util/Set;

    move-result-object v3

    .line 11620
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    iget-object v5, v2, Latf;->f:Ldax;

    iget-object v5, v5, Ldax;->b:[Ljava/lang/String;

    array-length v5, v5

    if-ne v4, v5, :cond_1

    iget-object v4, v2, Latf;->f:Ldax;

    iget-object v4, v4, Ldax;->b:[Ljava/lang/String;

    .line 11621
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 11623
    const/4 v0, 0x0

    goto :goto_0

    .line 11626
    :cond_1
    iget-object v4, v2, Latf;->f:Ldax;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v5

    new-array v5, v5, [Ljava/lang/String;

    iput-object v5, v4, Ldax;->b:[Ljava/lang/String;

    .line 11627
    iget-object v4, v2, Latf;->f:Ldax;

    iget-object v4, v4, Ldax;->b:[Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 11628
    invoke-virtual {v2}, Latf;->b()V

    goto :goto_0
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 372
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    invoke-virtual {v0}, Lbah;->b()V

    .line 373
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/MainActivity;->k:Laxd;

    .line 16153
    iget-object v1, v0, Laxd;->o:Landroid/os/Handler;

    iget-object v0, v0, Laxd;->p:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 374
    invoke-super {p0}, Lmm;->onStop()V

    .line 375
    return-void
.end method
