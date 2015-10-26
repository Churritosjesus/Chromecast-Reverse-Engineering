.class final Lbss;
.super Ljava/lang/Object;

# interfaces
.implements Lbwd;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lbyl;Ljava/lang/Object;Lbwg;Lbwh;)Lbwc;
    .locals 9

    .prologue
    .line 0
    check-cast p4, Lbta;

    .line 1000
    const-string v0, "Setting the API options is required."

    invoke-static {p4, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lbue;

    iget-object v3, p4, Lbta;->a:Lcom/google/android/gms/cast/CastDevice;

    .line 2000
    iget v1, p4, Lbta;->c:I

    .line 1000
    int-to-long v4, v1

    iget-object v6, p4, Lbta;->b:Lbtc;

    move-object v1, p1

    move-object v2, p2

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lbue;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/cast/CastDevice;JLbtc;Lbwg;Lbwh;)V

    .line 0
    return-object v0
.end method
