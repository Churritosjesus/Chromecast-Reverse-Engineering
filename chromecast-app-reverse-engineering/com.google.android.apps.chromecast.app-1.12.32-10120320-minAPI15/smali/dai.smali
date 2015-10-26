.class public final Ldai;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:[I

.field public static final b:I = 0x2

.field public static final c:I = 0x4

.field public static final d:I = 0x0

.field public static final e:I = 0x1

.field public static final f:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7732
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Ldai;->a:[I

    .line 11301
    return-void

    .line 7732
    nop

    :array_0
    .array-data 4
        0x7f010010
        0x7f010011
        0x7f010012
        0x7f010013
        0x7f010014
    .end array-data
.end method
