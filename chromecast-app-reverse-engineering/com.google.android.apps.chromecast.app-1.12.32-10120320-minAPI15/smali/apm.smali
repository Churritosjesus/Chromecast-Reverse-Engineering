.class final Lapm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Lbwn;

.field private synthetic d:Lapk;


# direct methods
.method constructor <init>(Lapk;ZLjava/lang/String;Lbwn;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lapm;->d:Lapk;

    iput-boolean p2, p0, Lapm;->a:Z

    iput-object p3, p0, Lapm;->b:Ljava/lang/String;

    iput-object p4, p0, Lapm;->c:Lbwn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 142
    iget-boolean v0, p0, Lapm;->a:Z

    if-eqz v0, :cond_0

    .line 143
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Lapm;->d:Lapk;

    iget-object v1, v1, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lapm;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbsu;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lbwj;

    move-result-object v0

    iget-object v1, p0, Lapm;->c:Lbwn;

    .line 144
    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 149
    :goto_0
    return-void

    .line 146
    :cond_0
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Lapm;->d:Lapk;

    iget-object v1, v1, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lapm;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbsu;->b(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lbwj;

    move-result-object v0

    iget-object v1, p0, Lapm;->c:Lbwn;

    .line 147
    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    goto :goto_0
.end method
