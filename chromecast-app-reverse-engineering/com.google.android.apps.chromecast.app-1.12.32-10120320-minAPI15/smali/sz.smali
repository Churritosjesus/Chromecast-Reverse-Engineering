.class final Lsz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 738
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 738
    .line 2740
    new-instance v0, Lsy;

    .line 3718
    invoke-direct {v0, p1}, Lsy;-><init>(Landroid/os/Parcel;)V

    .line 738
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 738
    .line 1744
    new-array v0, p1, [Lsy;

    .line 738
    return-object v0
.end method
