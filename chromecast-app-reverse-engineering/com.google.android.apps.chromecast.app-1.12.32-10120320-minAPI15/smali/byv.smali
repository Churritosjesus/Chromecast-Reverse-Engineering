.class public final Lbyv;
.super Lbyp;


# instance fields
.field private synthetic a:Lbyo;


# direct methods
.method public constructor <init>(Lbyo;)V
    .locals 2

    iput-object p1, p0, Lbyv;->a:Lbyo;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lbyp;-><init>(Lbyo;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lbyv;->a:Lbyo;

    invoke-static {v0}, Lbyo;->a(Lbyo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbyv;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbwi;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lbyv;->a:Lbyo;

    invoke-static {v0}, Lbyo;->c(Lbyo;)Lbyx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbyx;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0
.end method

.method protected final a()Z
    .locals 4

    const/4 v1, 0x1

    iget-object v0, p0, Lbyv;->a:Lbyo;

    invoke-static {v0}, Lbyo;->a(Lbyo;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbyv;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "mConnectionProgressReportCallbacks should not be null if mReportProgress"

    invoke-static {v0, v2}, La;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbyv;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/common/ConnectionResult;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v2}, Lbwi;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    :goto_1
    return v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbyv;->a:Lbyo;

    const/4 v2, 0x0

    iget-object v3, p0, Lbyv;->a:Lbyo;

    invoke-static {v3}, Lbyo;->e(Lbyo;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbyo;->a(Lbzf;Ljava/util/Set;)V

    goto :goto_1
.end method
