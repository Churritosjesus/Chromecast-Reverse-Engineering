.class public final Laoz;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field private static enum e:I

.field private static final synthetic f:[I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v0, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 103
    sput v3, Laoz;->a:I

    sput v4, Laoz;->b:I

    sput v5, Laoz;->c:I

    sput v6, Laoz;->e:I

    sput v0, Laoz;->d:I

    .line 102
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Laoz;->a:I

    aput v2, v0, v1

    sget v1, Laoz;->b:I

    aput v1, v0, v3

    sget v1, Laoz;->c:I

    aput v1, v0, v4

    sget v1, Laoz;->e:I

    aput v1, v0, v5

    sget v1, Laoz;->d:I

    aput v1, v0, v6

    sput-object v0, Laoz;->f:[I

    return-void
.end method
