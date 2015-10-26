.class final Lani;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lapd;

.field private synthetic b:I

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Land;


# direct methods
.method constructor <init>(Land;Lapd;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 686
    iput-object p1, p0, Lani;->d:Land;

    iput-object p2, p0, Lani;->a:Lapd;

    iput p3, p0, Lani;->b:I

    iput-object p4, p0, Lani;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 686
    .line 1690
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lani;->a:Lapd;

    invoke-virtual {v1, v6}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1692
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iget-object v1, p0, Lani;->d:Land;

    invoke-static {v1}, Land;->b(Land;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lalm;->c(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 1693
    if-eqz v0, :cond_0

    .line 1694
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v1

    invoke-virtual {v1, v0}, Lalm;->a(Laow;)V

    .line 1695
    iget v1, p0, Lani;->b:I

    sget v2, Lbfk;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lani;->c:Ljava/lang/String;

    .line 1696
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1699
    new-instance v1, Ldcg;

    invoke-direct {v1}, Ldcg;-><init>()V

    .line 1701
    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Ldcg;->a:Ljava/lang/Integer;

    .line 1702
    new-array v2, v6, [Ldbt;

    .line 1703
    invoke-static {v0}, Lasr;->a(Laow;)Ldbt;

    move-result-object v0

    aput-object v0, v2, v7

    iput-object v2, v1, Ldcg;->c:[Ldbt;

    .line 1705
    :try_start_0
    iget-object v0, p0, Lani;->d:Land;

    invoke-virtual {v0}, Land;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    new-instance v2, Lauf;

    iget-object v3, p0, Lani;->d:Land;

    .line 1707
    invoke-virtual {v3}, Land;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 1706
    invoke-static {v3}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v3, v1, v4, v5}, Lauf;-><init>(Ljava/lang/String;Ldcg;Laea;Ladz;)V

    .line 1705
    invoke-virtual {v0, v2}, Latf;->a(Lads;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1713
    :cond_0
    :goto_0
    iget-object v0, p0, Lani;->d:Land;

    invoke-virtual {v0}, Land;->finish()V

    .line 686
    return-void

    .line 1708
    :catch_0
    move-exception v0

    .line 1709
    iget-object v1, p0, Lani;->d:Land;

    iget-object v1, v1, Land;->t:Lblp;

    const-string v2, "Could not serialize device link data: %s"

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v0, v3, v7

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final b_(I)V
    .locals 3

    .prologue
    .line 718
    iget-object v0, p0, Lani;->d:Land;

    iget-object v1, p0, Lani;->d:Land;

    sget v2, Lb;->aO:I

    invoke-virtual {v1, v2}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Land;->e(Ljava/lang/String;)V

    .line 719
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lani;->a:Lapd;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 720
    iget-object v0, p0, Lani;->d:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 721
    iget-object v0, p0, Lani;->d:Land;

    invoke-virtual {v0}, Land;->w()V

    .line 722
    return-void
.end method
