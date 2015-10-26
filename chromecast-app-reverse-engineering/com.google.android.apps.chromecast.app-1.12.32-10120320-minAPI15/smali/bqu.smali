.class public final Lbqu;
.super Lbra;


# instance fields
.field final a:Lbrn;

.field final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbrb;Lbrd;)V
    .locals 1

    invoke-direct {p0, p1}, Lbra;-><init>(Lbrb;)V

    invoke-static {p2}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1}, Lbrd;->c(Lbrb;)Lbrn;

    move-result-object v0

    iput-object v0, p0, Lbqu;->a:Lbrn;

    invoke-direct {p0}, Lbqu;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbqu;->b:Ljava/lang/String;

    return-void
.end method

.method private f()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 10000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    .line 11000
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbqz;->d:Lbrb;

    .line 12000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 13000
    iget-object v1, p0, Lbqz;->d:Lbrb;

    .line 14000
    iget-object v1, v1, Lbrb;->a:Landroid/content/Context;

    .line 0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "4.5.0-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get service version"

    invoke-virtual {p0, v1, v0}, Lbqu;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "0"

    goto :goto_0
.end method


# virtual methods
.method public final a(Lbre;)J
    .locals 4

    .prologue
    .line 0
    invoke-virtual {p0}, Lbqu;->r()V

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    invoke-static {}, Lbrb;->i()V

    .line 0
    iget-object v0, p0, Lbqu;->a:Lbrn;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lbrn;->a(Lbre;Z)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lbqu;->a:Lbrn;

    invoke-virtual {v2, p1}, Lbrn;->a(Lbre;)V

    :cond_0
    return-wide v0
.end method

.method protected final a()V
    .locals 1

    iget-object v0, p0, Lbqu;->a:Lbrn;

    invoke-virtual {v0}, Lbrn;->s()V

    return-void
.end method

.method public final a(Lbsf;)V
    .locals 2

    .prologue
    .line 0
    invoke-virtual {p0}, Lbqu;->r()V

    .line 3000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 0
    new-instance v1, Lbqy;

    invoke-direct {v1, p0, p1}, Lbqy;-><init>(Lbqu;Lbsf;)V

    invoke-virtual {v0, v1}, Lcox;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lbsi;)V
    .locals 2

    .prologue
    .line 0
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lbqu;->r()V

    const-string v0, "Hit delivery requested"

    invoke-virtual {p0, v0, p1}, Lbqu;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 0
    new-instance v1, Lbqx;

    invoke-direct {v1, p0, p1}, Lbqx;-><init>(Lbqu;Lbsi;)V

    invoke-virtual {v0, v1}, Lcox;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 0
    const-string v0, "campaign param can\'t be empty"

    invoke-static {p1, v0}, La;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 9000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 0
    new-instance v1, Lbqw;

    invoke-direct {v1, p0, p1, p2}, Lbqw;-><init>(Lbqu;Ljava/lang/String;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcox;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 0
    const-string v0, "Network connectivity status changed"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lbqu;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 0
    new-instance v1, Lbqv;

    invoke-direct {v1, p0, p1}, Lbqv;-><init>(Lbqu;Z)V

    invoke-virtual {v0, v1}, Lcox;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lbqu;->r()V

    .line 4000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    .line 5000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 0
    invoke-static {v0}, Lbpe;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lbpf;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lbpf;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.google.android.gms.analytics.ANALYTICS_DISPATCH"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lbqu;->a(Lbsf;)V

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    invoke-virtual {p0}, Lbqu;->r()V

    invoke-static {}, Lcox;->b()V

    iget-object v0, p0, Lbqu;->a:Lbrn;

    invoke-virtual {v0}, Lbrn;->f()V

    return-void
.end method

.method final d()V
    .locals 1

    .prologue
    .line 0
    .line 7000
    invoke-static {}, Lbrb;->i()V

    .line 0
    iget-object v0, p0, Lbqu;->a:Lbrn;

    invoke-virtual {v0}, Lbrn;->e()V

    return-void
.end method

.method final e()V
    .locals 1

    .prologue
    .line 0
    .line 8000
    invoke-static {}, Lbrb;->i()V

    .line 0
    iget-object v0, p0, Lbqu;->a:Lbrn;

    invoke-virtual {v0}, Lbrn;->d()V

    return-void
.end method
