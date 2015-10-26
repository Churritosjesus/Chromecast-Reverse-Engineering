.class final Lapi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 121
    .line 2124
    new-instance v0, Laph;

    .line 3021
    invoke-direct {v0, p1}, Laph;-><init>(Landroid/os/Parcel;)V

    .line 121
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 121
    .line 1129
    new-array v0, p1, [Laph;

    .line 121
    return-object v0
.end method
