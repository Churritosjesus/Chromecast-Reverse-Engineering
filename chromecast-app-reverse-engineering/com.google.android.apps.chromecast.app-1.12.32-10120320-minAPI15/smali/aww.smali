.class final Laww;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field final synthetic a:Lawr;

.field private synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lawr;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 263
    iput-object p1, p0, Laww;->a:Lawr;

    iput-object p2, p0, Laww;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 263
    check-cast p1, Ldbi;

    .line 1266
    iget-object v0, p0, Laww;->a:Lawr;

    invoke-static {v0}, Lawr;->d(Lawr;)Lblp;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Laww;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    .line 1267
    iget-object v0, p0, Laww;->a:Lawr;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 1268
    if-eqz v0, :cond_0

    .line 1269
    new-instance v1, Lawx;

    invoke-direct {v1, p0, p1}, Lawx;-><init>(Laww;Ldbi;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 263
    :cond_0
    return-void
.end method
