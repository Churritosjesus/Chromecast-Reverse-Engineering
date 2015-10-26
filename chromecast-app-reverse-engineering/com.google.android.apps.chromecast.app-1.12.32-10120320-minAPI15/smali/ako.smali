.class final Lako;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 621
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 621
    .line 2624
    new-instance v0, Lakn;

    .line 3531
    invoke-direct {v0, p1}, Lakn;-><init>(Landroid/os/Parcel;)V

    .line 621
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 621
    .line 1629
    new-array v0, p1, [Lakn;

    .line 621
    return-object v0
.end method
