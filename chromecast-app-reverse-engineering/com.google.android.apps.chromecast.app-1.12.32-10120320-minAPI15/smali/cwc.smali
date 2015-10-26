.class public final Lcwc;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field private static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    sput v3, Lcwc;->a:I

    sput v4, Lcwc;->b:I

    sput v0, Lcwc;->c:I

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcwc;->a:I

    aput v2, v0, v1

    sget v1, Lcwc;->b:I

    aput v1, v0, v3

    sget v1, Lcwc;->c:I

    aput v1, v0, v4

    sput-object v0, Lcwc;->d:[I

    return-void
.end method
