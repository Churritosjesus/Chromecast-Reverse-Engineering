.class final Lrb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 380
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 380
    .line 2382
    new-instance v0, Lra;

    invoke-direct {v0, p1}, Lra;-><init>(Landroid/os/Parcel;)V

    .line 380
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 380
    .line 1386
    new-array v0, p1, [Lra;

    .line 380
    return-object v0
.end method
