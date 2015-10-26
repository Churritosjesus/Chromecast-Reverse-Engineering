.class public final Lbkl;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Lbkl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 9
    new-instance v0, Lbkl;

    invoke-direct {v0}, Lbkl;-><init>()V

    sput-object v0, Lbkl;->a:Lbkl;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lbkl;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lbkl;->a:Lbkl;

    return-object v0
.end method

.method public static b()J
    .locals 2

    .prologue
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method
