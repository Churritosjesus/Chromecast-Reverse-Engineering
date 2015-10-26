.class public final Lbvq;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lbvq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbvq;

    invoke-direct {v0}, Lbvq;-><init>()V

    sput-object v0, Lbvq;->a:Lbvq;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 2

    invoke-static {p0}, Lbvt;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {p0, v0}, Lbvt;->b(Landroid/content/Context;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v0, 0x12

    :cond_0
    return v0
.end method

.method public static a()Lbvq;
    .locals 1

    sget-object v0, Lbvq;->a:Lbvq;

    return-object v0
.end method
