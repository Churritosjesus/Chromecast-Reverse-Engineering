.class final Lauu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lawc;


# instance fields
.field private synthetic a:Ljava/util/UUID;

.field private synthetic b:Laus;


# direct methods
.method constructor <init>(Laus;Ljava/util/UUID;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lauu;->b:Laus;

    iput-object p2, p0, Lauu;->a:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 129
    iget-object v0, p0, Lauu;->b:Laus;

    .line 1025
    iget-object v0, v0, Laus;->a:Landroid/os/Handler;

    .line 129
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 130
    return-void
.end method

.method public final a([B)V
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Lauu;->b:Laus;

    iget-object v1, p0, Lauu;->a:Ljava/util/UUID;

    invoke-virtual {v0, p1, v1}, Laus;->a([BLjava/util/UUID;)V

    .line 125
    return-void
.end method
