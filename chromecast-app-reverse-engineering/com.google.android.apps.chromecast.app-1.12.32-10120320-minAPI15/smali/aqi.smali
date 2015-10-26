.class public final Laqi;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static b:Laqi;


# instance fields
.field a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    sput-object v0, Laqi;->b:Laqi;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public static a()Laqi;
    .locals 1

    .prologue
    .line 30
    sget-object v0, Laqi;->b:Laqi;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Laqi;

    invoke-direct {v0}, Laqi;-><init>()V

    sput-object v0, Laqi;->b:Laqi;

    .line 32
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 34
    :cond_0
    sget-object v0, Laqi;->b:Laqi;

    return-object v0
.end method
