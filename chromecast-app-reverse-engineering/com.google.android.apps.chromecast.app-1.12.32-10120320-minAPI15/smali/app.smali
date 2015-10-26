.class final Lapp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lapo;


# direct methods
.method constructor <init>(Lapo;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lapp;->a:Lapo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 4

    .prologue
    .line 182
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 1185
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1186
    iget-object v0, p0, Lapp;->a:Lapo;

    iget-object v0, v0, Lapo;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 1187
    iget-object v0, p0, Lapp;->a:Lapo;

    iget-object v0, v0, Lapo;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1189
    :cond_0
    invoke-static {}, Lapk;->d()Lblp;

    move-result-object v0

    const-string v1, "Sending message failed: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    :cond_1
    return-void
.end method
