.class final Lapo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Lapk;


# direct methods
.method constructor <init>(Lapk;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lapo;->d:Lapk;

    iput-object p2, p0, Lapo;->b:Ljava/lang/String;

    iput-object p3, p0, Lapo;->c:Ljava/lang/String;

    iput-object p4, p0, Lapo;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 180
    invoke-static {}, Lapk;->d()Lblp;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lapo;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lapo;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 181
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Lapo;->d:Lapk;

    iget-object v1, v1, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lapo;->b:Ljava/lang/String;

    iget-object v3, p0, Lapo;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lbsu;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lbwj;

    move-result-object v0

    new-instance v1, Lapp;

    invoke-direct {v1, p0}, Lapp;-><init>(Lapo;)V

    .line 182
    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 193
    return-void
.end method
