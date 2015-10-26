.class final Ldjm;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:Ldix;

.field private synthetic b:Ldjk;


# direct methods
.method varargs constructor <init>(Ldjk;Ljava/lang/String;[Ljava/lang/Object;Ldix;)V
    .locals 0

    .prologue
    .line 716
    iput-object p1, p0, Ldjm;->b:Ldjk;

    iput-object p4, p0, Ldjm;->a:Ldix;

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 719
    :try_start_0
    iget-object v0, p0, Ldjm;->b:Ldjk;

    iget-object v0, v0, Ldjk;->a:Ldjb;

    iget-object v0, v0, Ldjb;->i:Ldid;

    iget-object v1, p0, Ldjm;->a:Ldix;

    invoke-interface {v0, v1}, Ldid;->a(Ldix;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 722
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
