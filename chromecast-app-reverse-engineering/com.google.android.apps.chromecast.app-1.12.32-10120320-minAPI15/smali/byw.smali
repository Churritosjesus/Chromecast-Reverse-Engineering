.class public final Lbyw;
.super Lbyp;


# instance fields
.field private synthetic a:Lbyo;


# direct methods
.method public constructor <init>(Lbyo;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lbyw;->a:Lbyo;

    invoke-direct {p0, p1, p2, p3}, Lbyp;-><init>(Lbyo;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lbyw;->a:Lbyo;

    invoke-static {v0}, Lbyo;->a(Lbyo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbyw;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbwi;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lbyw;->a:Lbyo;

    invoke-static {v0}, Lbyo;->c(Lbyo;)Lbyx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbyx;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0
.end method

.method protected final a()Z
    .locals 3

    const/4 v1, 0x1

    iget-object v0, p0, Lbyw;->a:Lbyo;

    invoke-static {v0}, Lbyo;->a(Lbyo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbyw;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null"

    invoke-static {v0, v2}, La;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbyw;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/common/ConnectionResult;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v2}, Lbwi;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
