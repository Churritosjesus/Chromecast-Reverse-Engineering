.class final Lalr;
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

    .line 124
    sput v3, Lalr;->a:I

    .line 125
    sput v0, Lalr;->b:I

    .line 123
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lalr;->a:I

    aput v2, v0, v1

    sget v1, Lalr;->b:I

    aput v1, v0, v3

    sput-object v0, Lalr;->c:[I

    return-void
.end method
