.class final Lapn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lbtd;

.field private synthetic c:Lapk;


# direct methods
.method constructor <init>(Lapk;Ljava/lang/String;Lbtd;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lapn;->c:Lapk;

    iput-object p2, p0, Lapn;->a:Ljava/lang/String;

    iput-object p3, p0, Lapn;->b:Lbtd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 165
    :try_start_0
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Lapn;->c:Lapk;

    iget-object v1, v1, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lapn;->a:Ljava/lang/String;

    iget-object v3, p0, Lapn;->b:Lbtd;

    invoke-virtual {v0, v1, v2, v3}, Lbsu;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lbtd;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    :goto_0
    return-void

    .line 166
    :catch_0
    move-exception v0

    .line 167
    invoke-static {}, Lapk;->d()Lblp;

    move-result-object v1

    const-string v2, "Exception while creating channel: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
