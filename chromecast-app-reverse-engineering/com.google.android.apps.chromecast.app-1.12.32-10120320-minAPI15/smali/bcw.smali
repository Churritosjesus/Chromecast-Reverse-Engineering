.class final Lbcw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    .line 2077
    new-instance v0, Lbcv;

    invoke-direct {v0, p1}, Lbcv;-><init>(Landroid/os/Parcel;)V

    .line 74
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    .line 1082
    new-array v0, p1, [Lbcv;

    .line 74
    return-object v0
.end method
