.class final Lcpy;
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
    .locals 7

    .prologue
    .line 0
    check-cast p4, Lcpz;

    .line 1000
    const-string v0, "Must provide valid PeopleOptions!"

    invoke-static {p4, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcsa;

    .line 2000
    iget v1, p4, Lcpz;->a:I

    .line 1000
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move-object v4, p6

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcsa;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;Lbyl;)V

    .line 0
    return-object v0
.end method
