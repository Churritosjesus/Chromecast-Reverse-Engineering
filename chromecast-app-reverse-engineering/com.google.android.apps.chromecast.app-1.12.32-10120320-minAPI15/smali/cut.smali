.class public Lcut;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcuq;Landroid/os/Looper;Ljava/lang/String;ILczb;)Lcto;
    .locals 7

    .prologue
    .line 1000
    new-instance v0, Lcto;

    const/4 v3, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcto;-><init>(Landroid/content/Context;Lcuq;Landroid/os/Looper;Ljava/lang/String;ILczb;)V

    return-object v0
.end method
