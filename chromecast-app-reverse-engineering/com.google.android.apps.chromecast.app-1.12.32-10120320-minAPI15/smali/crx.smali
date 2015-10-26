.class public final Lcrx;
.super Lbya;

# interfaces
.implements Lcsq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lbya;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "account_name"

    invoke-virtual {p0, v0}, Lcrx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 0
    const-string v0, "display_name"

    invoke-virtual {p0, v0}, Lcrx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1000
    const-string v0, "account_name"

    invoke-virtual {p0, v0}, Lcrx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 0
    :cond_0
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcrz;->a:Lcrz;

    const-string v1, "avatar"

    invoke-virtual {p0, v1}, Lcrx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcrz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "page_gaia_id"

    invoke-virtual {p0, v0}, Lcrx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcrz;->a:Lcrz;

    const-string v1, "cover_photo_url"

    invoke-virtual {p0, v1}, Lcrx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcrz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
