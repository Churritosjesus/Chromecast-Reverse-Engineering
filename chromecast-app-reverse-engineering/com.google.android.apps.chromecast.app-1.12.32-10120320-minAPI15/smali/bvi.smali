.class final Lbvi;
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
    .locals 6

    .prologue
    .line 0
    .line 1000
    new-instance v0, Lckl;

    .line 2000
    iget-object v5, p3, Lbyl;->f:Ljava/lang/String;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move-object v4, p6

    .line 1000
    invoke-direct/range {v0 .. v5}, Lckl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;)V

    .line 0
    return-object v0
.end method
