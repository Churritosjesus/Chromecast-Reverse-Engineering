.class public final Laho;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field private static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v3, 0x1

    .line 158
    sput v3, Laho;->a:I

    .line 163
    sput v0, Laho;->b:I

    .line 153
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Laho;->a:I

    aput v2, v0, v1

    sget v1, Laho;->b:I

    aput v1, v0, v3

    sput-object v0, Laho;->c:[I

    return-void
.end method
